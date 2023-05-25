package pages.web_desktop;

import com.codeborne.selenide.Condition;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class MtsOfficeAndAtmPage {

    String textnameOffice;
    public final By CITY_NAME = By.xpath("//*[@class='styled__Container-sc-1m80q5x-0 dbbrBq']//input[@aria-controls='react-autowhatever-1']");
    public final By FIRST_CITY = By.xpath("//*[@id='react-autowhatever-1--item-0']");
    public final By BUTTON_FILTER = By.xpath("//*[@class='styled__MainRow-sc-szata3-1 eYzYUx']//*[@data-testid='icon_baseX24/ic-arrow-down']");
    public final By CHECKBOX_EUR = By.xpath("//*[text()='EUR €']");
    public final By CHECKBOX_USD = By.xpath("//*[text()='USD $']");
    public final By CHECKBOX_SALON = By.xpath("//*[text()='Салон МТС']");
    public final By CHECKBOX_SHOP_S = By.xpath("//*[text()='Магазины Связной']");
    public final By CHECKBOX_ATM = By.xpath("//*[text()='Банкоматы']");
    public final By CHECKBOX_TERMINAL = By.xpath("//*[text()='Терминалы']");
    public final By CHECKBOX_PARTNER_ATM = By.xpath("//*[text()='Партнерские банкоматы']");
    public final By OPEN_NOW = By.xpath("//*[text()='Работает сейчас']");
    public final By MAP = By.xpath("//*[@class='ymaps-2-1-79-inner-panes']");
    public final By POINT_IN_MAP = By.xpath("//*[@class='ymaps-2-1-79-map']//*[@class='ymaps-2-1-79-placemark-overlay ymaps-2-1-79-user-selection-none']//ymaps[@class='ymaps-2-1-79-image ']");
    public final By NAME_OFFICE = By.xpath("//*[@class='styled__DesktopUnitInfoBlock-sc-b6tth5-0 fRlCcw']//*[@data-testid='heading']");
    public final  By BUTTON_LIST = By.xpath("//*[text()='Списком']");

    public  By NAME_OFFICE_IN_LIST = By.xpath("//*[@class='styled__SmartText-n9vm43-0 gWGfyf styled__TextWithOverflow-sc-egp5sf-3 bxtWxp']");
    @SneakyThrows
    public MtsOfficeAndAtmPage writeCity(String city){
        $(CITY_NAME).click();
        $(CITY_NAME).sendKeys(Keys.CONTROL, "a");
        $(CITY_NAME).sendKeys(Keys.BACK_SPACE);
        Thread.sleep(2000);
        $(CITY_NAME).sendKeys(city);
        return this;
    }

    public MtsOfficeAndAtmPage clickFirstCity(){
        $(FIRST_CITY).click();
        return this;
    }

    public MtsOfficeAndAtmPage openFiterList(){
        $(BUTTON_FILTER).click();
        return this;
    }

    @SneakyThrows
    public MtsOfficeAndAtmPage clickCheckBoxAll(){
        $(CHECKBOX_USD).click();
        $(CHECKBOX_EUR).click();
        $(OPEN_NOW).click();
        $(CHECKBOX_SALON).scrollTo();
        Thread.sleep(2000);
        $(CHECKBOX_SALON).click();
        $(CHECKBOX_SHOP_S).click();
        $(CHECKBOX_ATM).click();
        $(CHECKBOX_TERMINAL).click();
        $(CHECKBOX_PARTNER_ATM).click();
        return this;
    }
    @SneakyThrows
    public MtsOfficeAndAtmPage clickOfficeOnMap(){
        $(BUTTON_FILTER).scrollTo();
        $(BUTTON_FILTER).click();
        $(POINT_IN_MAP).click();
        return this;
    }

    public MtsOfficeAndAtmPage getNameOffice(){
        textnameOffice = $(NAME_OFFICE).getText();
        return this;
    }

    public MtsOfficeAndAtmPage checkNameOffice(){
        $(BUTTON_LIST).click();
        $(NAME_OFFICE_IN_LIST).shouldHave(Condition.text(textnameOffice));
        return this;
    }
}
