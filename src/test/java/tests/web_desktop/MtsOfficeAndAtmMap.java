package tests.web_desktop;

import pages.web_desktop.MtsHomePage;
import org.junit.Test;
import pages.web_desktop.MtsIpotekaPage;
import pages.web_desktop.MtsOfficeAndAtmPage;

public class MtsOfficeAndAtmMap {

    MtsHomePage mtsHomePage = new MtsHomePage();
    MtsOfficeAndAtmPage mtsOfficeAndAtmPage =  new MtsOfficeAndAtmPage();
    String city = "Сочи";
    @Test()
    public void CosttinCalculater() {

        mtsHomePage.openMtsHomePage()
                .clickButtonOfficeAndAtm();

        mtsOfficeAndAtmPage.writeCity(city)
                .clickFirstCity()
                .openFiterList()
                .clickCheckBoxAll()
                .clickOfficeOnMap()
                .getNameOffice()
                .checkNameOffice();

    }
}
