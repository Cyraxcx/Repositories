package Exception_home.w_3.base.interfaces;

import Exception_home.w_3.base.exceptions.FileCreateException;

import java.io.IOException;

public interface ICreateFile {
    public boolean createFile(String path) throws FileCreateException;
}
