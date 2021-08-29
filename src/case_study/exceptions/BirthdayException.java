package case_study.exceptions;

public class BirthdayException extends  Exception{
    public BirthdayException(){
        super("Birthday > 1900 , less than current year is 18 years and format : dd/MM/yyyy");
    }
}
