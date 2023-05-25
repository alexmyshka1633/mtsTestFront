package tests.web_desktop;

import pages.web_desktop.MtsHomePage;
import org.junit.Test;
import pages.web_desktop.MtsIpotekaPage;

public class MtsMortgageСosttInCalculator {

    MtsHomePage mtsHomePage = new MtsHomePage();
    MtsIpotekaPage mtsIpotekaPage = new MtsIpotekaPage();
    String city = "Москва";
    String priceHome = "26500000";
    String downPayment = "8180000";
    String creditTerm = "30";

    @Test()
    public void CosttinCalculater(){

        mtsHomePage.openMtsHomePage()
                .clickButtonMortgage();

        mtsIpotekaPage.clickListRalty()
                .clickListHousingType()
                .writeBuyProperty(city)
                .writePriceHome(priceHome)
                .writeDownPayment(downPayment)
                .writeCreditTerm(creditTerm)
                .checkSumCredit()
                .checkTermCredit();

    }
}
