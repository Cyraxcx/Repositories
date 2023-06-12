package Exception_home.w_3.base.exceptions;

public class ParseDataToIntegerException extends NumberFormatException{
    public ParseDataToIntegerException(String s) {
        super("Failed to convert string to integer!: " + s);
    }
}
