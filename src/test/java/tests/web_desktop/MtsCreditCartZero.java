package tests.web_desktop;

import org.junit.jupiter.api.Test;
import pages.web_desktop.MtsCartPage;
import pages.web_desktop.MtsHomePage;

public class MtsCreditCartZero {
    MtsHomePage mtsHomePage = new MtsHomePage();

    MtsCartPage mtsCartPage = new MtsCartPage();

   @Test
    public void CreditCartZero(){

        mtsHomePage.openMtsHomePage()
                .clickButtonCart();

        mtsCartPage.testCreditCard();


    }
}
