package Klasurvorbereitung.AenderungenAnWebseiten;


import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

public class WebsiteChangeWatcher extends Thread {
    private String target;
    private String path;
    private Consumer<String> onUpdate;
    private boolean running = true;
    public WebsiteChangeWatcher(String target, String path,Consumer<String> onUpdate) {
        this.target = target;
        this.path = path;
        this.onUpdate=onUpdate;
    }
    public void cancel() {
        this.running = false;
        this.interrupt();
    }
    public void hasChanged(){
        try {
            String content = retrieveWebsiteContent();
            while(running){
                Thread.sleep(30000);
                String newContent = retrieveWebsiteContent();
                if(newContent!=null&&!newContent.equals(content)){
                    onUpdate.accept(newContent);
                    content= newContent;
                }
            }
        }catch(InterruptedException e){
            System.out.println("Watcher wurde gestoppt");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run(){
        hasChanged();
    }
    private String retrieveWebsiteContent(){
        return "Dummy Content für " + target + "/" + path + " (Zeit: " + System.currentTimeMillis() + ")";
    }
    public static void main(String[]args){
        Consumer<String> consoleLogger = content -> System.out.println("Änderung erkannt! Neuer Inhalt:\n" + content);

        // ii. Instanz erstellen und Thread starten
        WebsiteChangeWatcher watcher = new WebsiteChangeWatcher(
                "https://www.zeit.de",
                "campus",
                consoleLogger
        );
        watcher.start();

        // iii. Nach 2 Minuten beenden
        try {
            Thread.sleep(120000); // 120.000 ms = 2 Minuten
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        watcher.cancel();
    }

}
