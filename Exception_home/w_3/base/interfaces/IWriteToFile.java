package Exception_home.w_3.base.interfaces;

import Exception_home.w_3.base.exceptions.MyFileCreateException;
import Exception_home.w_3.base.exceptions.TheSameFileWritingException;

public interface IWriteToFile {
    public boolean writeToFile(String[] infoToWrite) throws TheSameFileWritingException, MyFileCreateException;
}
