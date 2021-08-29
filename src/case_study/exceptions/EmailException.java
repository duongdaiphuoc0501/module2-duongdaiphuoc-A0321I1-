package case_study.exceptions;

public class EmailException extends Exception{
    public EmailException(){
        super("Format email must be abc@gmail.abc");
    }
}
