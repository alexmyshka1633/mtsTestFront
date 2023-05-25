package tests.web_mobile;

import org.junit.Test;
import pages.web_desktop.MtsHomePage;
import pages.web_desktop.MtsOfficeAndAtmPage;
import pages.web_mobile.MtsHomePageMob;
import pages.web_mobile.MtsOfficeAndAtmPageMob;

public class MtsOfficeAndAtmMapMob {

    MtsHomePageMob mtsHomePageMob = new MtsHomePageMob();
    MtsOfficeAndAtmPageMob mtsOfficeAndAtmPageMob =  new MtsOfficeAndAtmPageMob();
    String city = "Сочи";
    @Test()
    public void CosttinCalculater() {

        mtsHomePageMob.openMtsHomePage()
                .clickButtonOfficeAndAtm();

        mtsOfficeAndAtmPageMob.writeCity(city)
                .clickFirstCity()
                .openFiterList()
                .clickCheckBoxAll()
                .clickOfficeOnMap()
                .getNameOffice()
                .checkNameOffice();

    }
}
