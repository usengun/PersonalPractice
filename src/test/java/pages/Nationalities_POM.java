package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Nationalities_POM extends MyMethods {
    public Nationalities_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
