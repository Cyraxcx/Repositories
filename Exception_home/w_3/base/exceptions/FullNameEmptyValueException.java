package Exception_home.w_3.base.exceptions;

public class FullNameEmptyValueException extends RuntimeException{
    public FullNameEmptyValueException() {
        super("One or more values in the full name are empty!!!");
    }
}
