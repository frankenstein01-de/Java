package Klasurvorbereitung.AufgabeIBAN;

public class FalscheIBANException extends RuntimeException{
    public FalscheIBANException(){
        super();
    }
    public FalscheIBANException(String nachricht){
        super(nachricht);
    }

}
