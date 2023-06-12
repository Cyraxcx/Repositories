package Exception_home.w_3;



import Exception_home.w_3.base.classes.Presenter;
import Exception_home.w_3.base.classes.checkInputData.*;
import Exception_home.w_3.base.classes.parseData.CDataParseProcessor;
import Exception_home.w_3.base.classes.ui.CGetData;
import Exception_home.w_3.base.classes.workWithFile.CFileCreator;
import Exception_home.w_3.base.classes.workWithFile.CFileWriter;
import Exception_home.w_3.base.classes.workWithFile.CFindTheSameFileName;


import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        // Путь к папке с файлами
        String infoPathFolder = "src/w_3/data/";
        Presenter presenter = new Presenter(new CGetData(),
                                            new CDataParseProcessor(),
                                            new CCheckDataProcessor(new CCheckQuantity(),
                                                                    new CCheckFullName(),
                                                                    new CCheckBirthday(),
                                                                    new CCheckSex()),
                                            new CFileWriter(new CFileCreator(),
                                                            new CFindTheSameFileName(),
                                                    infoPathFolder));
        presenter.run();
    }
}
