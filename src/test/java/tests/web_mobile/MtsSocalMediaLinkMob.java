package tests.web_mobile;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import pages.web_mobile.CbrInfoMtsBankPageMob;
import pages.web_mobile.MtsHomePageMob;

public class MtsSocalMediaLinkMob {

    @Test
    public void testSocialMediaLinks() {

        MtsHomePageMob mtsHomePageMob = new MtsHomePageMob();
        CbrInfoMtsBankPageMob cbrInfoMtsBankPageMob = new CbrInfoMtsBankPageMob();

        mtsHomePageMob.openMtsHomePage();
        String telegramLink = mtsHomePageMob.getTelegramLink();
        String vkLink = mtsHomePageMob.getVkLink();
        String odnoklassnikiLink = mtsHomePageMob.getOdnoklassnikiLink();

        cbrInfoMtsBankPageMob.openCbrInfoMtsBankPage();
        cbrInfoMtsBankPageMob.clickButtonCookie();
        boolean areLinksEqual = cbrInfoMtsBankPageMob.compareLinks(telegramLink, vkLink, odnoklassnikiLink);

        Assert.assertTrue("Social media links don't match", areLinksEqual);
    }
}
