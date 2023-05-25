package tests.web_desktop;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import pages.web_desktop.CbrInfoMtsBankPage;
import pages.web_desktop.MtsHomePage;

public class MtsSocalMediaLink {

    @Test
    public void testSocialMediaLinks() {

        MtsHomePage mtsHomePage = new MtsHomePage();
        CbrInfoMtsBankPage cbrInfoMtsBankPage = new CbrInfoMtsBankPage();

        mtsHomePage.openMtsHomePage();
        String telegramLink = mtsHomePage.getTelegramLink();
        String vkLink = mtsHomePage.getVkLink();
        String odnoklassnikiLink = mtsHomePage.getOdnoklassnikiLink();

        cbrInfoMtsBankPage.openCbrInfoMtsBankPage();
        cbrInfoMtsBankPage.clickButtonCookie();
        boolean areLinksEqual = cbrInfoMtsBankPage.compareLinks(telegramLink, vkLink, odnoklassnikiLink);

        Assert.assertTrue("Social media links don't match", areLinksEqual);
    }
}
