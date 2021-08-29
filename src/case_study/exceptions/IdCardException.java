package case_study.exceptions;

public class IdCardException extends Exception{
    public IdCardException(){
        super("IdCard must be 9 digits and format XXX XXX XXX.");
    }
}
