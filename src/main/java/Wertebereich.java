

import java.io.IOException;
import java.io.OutputStream;

public class Wertebereich extends OutputStream {
    @Override
    public void write(int b) throws IOException{
        System.out.println((char) b);
    }

    public void write(byte[]b,int off,int len)throws IOException{
        if(b==null){
            throw new NullPointerException();

        }else if(off<0||off>b.length||(off+len)>b.length||(off+len)<0){
            throw new IndexOutOfBoundsException();
        }else if(len==0){
            return;
        }
        for(int i=0;i<len;i++){
            write(b[off+i]);
        }
    }
    public static void main(String[]args){
        Wertebereich a = new Wertebereich();
        String text ="Hallo Java Welt:";
        byte[] daten = text.getBytes();
        try{
            int start = 4;
            int len = 4;
            System.out.println("Vollständiger Test"+ text);
            System.out.println("Ausschnitt via write ");
            a.write(daten,start,len);
        }catch(IOException e){
            e.printStackTrace();
        }catch(IndexOutOfBoundsException e){
            System.out.println("Fehler Ungültiger Offset oder Länge");
        }
    }

}
