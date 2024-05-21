package _07_Exceptions;

public class MyException extends Exception {
    public MyException(Exception e){
        super(e);
    }
}
