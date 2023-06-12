package Exception_home.w_3.base.abstractClasses;

import Exception_home.w_3.base.interfaces.ICheckBirthday;
import Exception_home.w_3.base.interfaces.ICheckFullName;
import Exception_home.w_3.base.interfaces.ICheckQuantity;
import Exception_home.w_3.base.interfaces.ICheckSex;

public abstract class ACheckDataProcessor implements ICheckFullName, ICheckQuantity, ICheckBirthday, ICheckSex {
    protected ACheckQuantity checkQuantity;
    protected ACheckFullName checkFullName;
    protected ACheckData checkBirthday;
    protected ACheckData checkSex;

    public ACheckDataProcessor(ACheckQuantity checkQuantity, ACheckFullName checkFullName, ACheckData checkBirthday, ACheckData checkSex) {
        this.checkQuantity = checkQuantity;
        this.checkFullName = checkFullName;
        this.checkBirthday = checkBirthday;
        this.checkSex = checkSex;
    }
}
