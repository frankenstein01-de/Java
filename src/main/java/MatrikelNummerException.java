public class MatrikelNummerException extends Exception{
    public MatrikelNummerException(){
        super("Ungültige Matrikelnummer angegeben.");
    }
    public MatrikelNummerException(String message){
        super(message);
    }
}
