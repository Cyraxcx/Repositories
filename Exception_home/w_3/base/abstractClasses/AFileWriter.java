package Exception_home.w_3.base.abstractClasses;

import Exception_home.w_3.base.classes.workWithFile.CFileCreator;
import Exception_home.w_3.base.classes.workWithFile.CFindTheSameFileName;
import Exception_home.w_3.base.interfaces.IWriteToFile;

import java.io.FileWriter;

public abstract class AFileWriter implements IWriteToFile {
    protected FileWriter fileWriter;
    protected CFileCreator fileCreator;
    protected CFindTheSameFileName findTheSameFileName;
}
