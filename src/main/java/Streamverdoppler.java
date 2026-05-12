import java.io.*;

public class Streamverdoppler extends OutputStream {
    FileOutputStream bos1;
    FileOutputStream bos2;
    public Streamverdoppler(FileOutputStream bos1,FileOutputStream bos2){
        this.bos1=bos1;
        this.bos2=bos2;

    }
    @Override
    public void close()throws IOException{
        try{
            bos1.close();
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Fehler Stream 1");
        }
        try {
            bos2.close();

        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Fehler Stream 2");
        }
    }

    @Override
    public void write(int b) throws IOException{

        try{
            bos1.write(b);

        }catch(IOException e){
            e.printStackTrace();
        }
        try {
            bos2.write(b);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[]args){
        try{
            FileOutputStream fos1 = new FileOutputStream("test1.txt");
            FileOutputStream fos2 = new FileOutputStream("test.txt");

            Streamverdoppler a = new Streamverdoppler(fos1,fos2);
            a.write('A');
            a.write('B');
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
