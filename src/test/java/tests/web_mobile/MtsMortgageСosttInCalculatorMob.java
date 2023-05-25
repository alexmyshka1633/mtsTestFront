package tests.web_mobile;

import org.junit.Test;
import pages.web_desktop.MtsHomePage;
import pages.web_desktop.MtsIpotekaPage;
import pages.web_mobile.MtsHomePageMob;
import pages.web_mobile.MtsIpotekaPageMob;

public class MtsMortgageСosttInCalculatorMob {

    MtsHomePageMob mtsHomePageMob = new MtsHomePageMob();
    MtsIpotekaPageMob mtsIpotekaPageMob = new MtsIpotekaPageMob();
    String city = "Москва";
    String priceHome = "26500000";
    String downPayment = "8180000";
    String creditTerm = "30";

    @Test()
    public void CosttinCalculater(){

        mtsHomePageMob.openMtsHomePage()
                .clickButtonMortgage();

        mtsIpotekaPageMob.clickListRalty()
                .clickListHousingType()
                .writeBuyProperty(city)
                .writePriceHome(priceHome)
                .writeDownPayment(downPayment)
                .writeCreditTerm(creditTerm)
                .checkSumCredit()
                .checkTermCredit();

    }
}
