import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTripler extends OutputStream {
    private OutputStream os1;
    private OutputStream os2;
    private OutputStream os3;

    public OutputStreamTripler(OutputStream os1,OutputStream os2,OutputStream os3){
        this.os1=os1;
        this.os2=os2;
        this.os3=os3;
    }
    @Override
    public void write(int b)throws IOException{
        String fehler="";
        try{
            os1.write(b);
        }catch(IOException e){
            fehler +="Stream1";
        }
        try {
            os2.write(b);

        }catch(IOException e){
            fehler +="Stream2";
        }
        try {
            os3.write(b);
        }catch (IOException e){
            fehler +="Stream3";
        }
        if(!fehler.isEmpty()){
            throw  new IOException("Fehler beim schreiben im"+ fehler);
        }
    }
    @Override
    public void close()throws IOException{
        String fehler="";
        try{
            os1.close();
        }catch (IOException e){
            fehler +="Stream1";
        }
        try{
            os2.close();
        }catch(IOException e){
            fehler +="Stream2";
        }
        try{
            os3.close();
        }catch(IOException e){
           fehler +="Stream3";
        }
        if(!fehler.isEmpty()){
            throw new IOException("Fehler beim Schließen im "+fehler);
        }
    }
    public static void main(String[]args){
        try{
            FileOutputStream os1 = new FileOutputStream("test.txt");
            FileOutputStream os2 = new FileOutputStream("test1.txt");
            FileOutputStream os3 = new FileOutputStream("test2.txt");

            OutputStreamTripler a = new OutputStreamTripler(os1,os2,os3);

            a.write('M');
            a.write('E');
            a.write('G');
            a.write('A');
            a.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
