package tests.web_mobile;

import org.junit.jupiter.api.Test;
import pages.web_mobile.MtsCartPageMob;
import pages.web_mobile.MtsHomePageMob;

public class MtsCreditCartZeroMob {
    MtsHomePageMob mtsHomePagemob = new MtsHomePageMob();

    MtsCartPageMob mtsCartPageMob = new MtsCartPageMob();

   @Test
    public void CreditCartZero(){

        mtsHomePagemob.openMtsHomePage()
                .clickButtonCart();

        mtsCartPageMob.testCreditCard();


    }
}
