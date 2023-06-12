package Exception_home.w_3.base.exceptions;

public class MyFileCreateException extends FileCreateException{
    public MyFileCreateException(String message) {
        super("Can't create file in CFileCreator: " + message);
    }
}
