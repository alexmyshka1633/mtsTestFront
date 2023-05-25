package pages.web_desktop;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import config.ProjectConfig;
import lombok.SneakyThrows;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MtsHomePage {

    private static final String BASE_URL = "https://www.mtsbank.ru/";

    public static final ProjectConfig cfg = ConfigFactory.create(ProjectConfig.class);
    public final By BUTTON_MORTGAGE = By.xpath("//*[@href='/chastnim-licam/ipoteka/']");
    public final By OFFICE_AND_ATM = By.xpath("//*[@href='/ofisi-i-bankomati/']");
    public final By LINK_TG = By.xpath("//*[@href='https://t.me/mts_bank_official']");
    public final By LINK_VK = By.xpath("//*[@href='https://vk.com/mtsbankru']");
    public final By LINK_OK = By.xpath("//*[@href='https://ok.ru/group/54564585799926/']");
    public final By IP_AND_SMALL_BUSINESS = By.xpath("//*[@href='/malomu-biznesu/']");
    public final By BUTTON_CART = By.xpath("//a[@href='/chastnim-licam/karti/']");


    public MtsHomePage openMtsHomePage() {
        Selenide.open(BASE_URL);
        return this;
    }

    public MtsHomePage clickButtonMortgage() {
        $(BUTTON_MORTGAGE).click();
        return this;
    }

    public MtsHomePage clickButtonOfficeAndAtm() {
        $(OFFICE_AND_ATM).click();
        return this;
    }

    public String getTelegramLink() {
        return getSocialMediaLink(LINK_TG);
    }

    public String getVkLink() {
        return getSocialMediaLink(LINK_VK);
    }

    public String getOdnoklassnikiLink() {
        return getSocialMediaLink(LINK_OK);
    }

    private String getSocialMediaLink(By locator) {
        SelenideElement linkElement = Selenide.$(locator);
        return linkElement.getAttribute("href");
    }

    public MtsHomePage clickIpAndSmallBusiness(){
        $(IP_AND_SMALL_BUSINESS).click();
        return this;
    }

    public MtsHomePage clickButtonCart(){
        $(BUTTON_CART).click();
        return this;
    }
}

