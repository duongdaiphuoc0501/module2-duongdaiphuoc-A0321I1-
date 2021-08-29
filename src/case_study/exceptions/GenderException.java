package case_study.exceptions;

public class GenderException extends Exception{
    public GenderException(){
        super("Gender must be Male , Female or Unknown.");
    }
}

