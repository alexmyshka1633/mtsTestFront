package pages.web_desktop;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CbrInfoMtsBankPage {
    private static final String BASE_URL = "https://www.cbr.ru/banking_sector/credit/coinfo/?id=450000343";
    private final By BUTTON_COOKIE = By.xpath("//*[@class='btn _medium _blue ']");
    private static final By TABS_LINKS_LOCATOR = By.xpath("//*[@class='tabs _links _cols-3']");

    public void openCbrInfoMtsBankPage() {
        Selenide.open(BASE_URL);
    }

    public void clickButtonCookie() {
        $(BUTTON_COOKIE).click();
    }

    public boolean compareLinks(String telegramLink, String vkLink, String odnoklassnikiLink) {
        ElementsCollection linkElements = $$(TABS_LINKS_LOCATOR).filterBy(Condition.visible);

        String cbrTelegramLink = linkElements.get(0).getAttribute("href");
        String cbrVkLink = linkElements.get(1).getAttribute("href");
        String cbrOdnoklassnikiLink = linkElements.get(2).getAttribute("href");

        return cbrTelegramLink.equals(telegramLink) && cbrVkLink.equals(vkLink) && cbrOdnoklassnikiLink.equals(odnoklassnikiLink);
    }
}


