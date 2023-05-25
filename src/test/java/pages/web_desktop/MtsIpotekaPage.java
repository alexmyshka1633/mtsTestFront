package pages.web_desktop;

import com.codeborne.selenide.Condition;
import lombok.extern.slf4j.Slf4j;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Timeout;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MtsIpotekaPage {

    String sumCredit = "18 300 000";
    String termCredit = "18 300 000";
    public final By OBJECT_RALTY = By.xpath("//*[@value='Квартира']");
    public final By LIST_RALTY_HOME = By.xpath("//*[@role='option']//*[text()='Дом']");
    public final By HOUSE_TYPE = By.xpath("//*[@value='Новостройка']");
    public final By LIST_HOUSE_TYPE = By.xpath("//*[@role='option']//*[text()='Вторичка']");
    public final By CITY_BUY_PROPERTY = By.xpath("//*[@placeholder='Введите город / регион']");
    public final By LIST_CITY = By.xpath("//li[@id='react-autowhatever-1--item-0']");
    public final By PRICE_HOME = By.xpath("//*[@label='Стоимость недвижимости']//*[@data-testid='input-slider']");
    public final By DOWN_PAYMENT = By.xpath("//*[@label='Первоначальный взнос']");
    public final By CREDIT_TERM = By.xpath("//*[@label='Срок кредита']");
    public final By SUM_CREDIT = By.xpath("//*[text()='Сумма кредита']/following::h4");
    public final By TERM_CREDIT = By.xpath("//*[text()='Срок']/following::h4");

    public MtsIpotekaPage clickListRalty(){
        $(OBJECT_RALTY).click();
        $(LIST_RALTY_HOME).click();
        return this;
    }

    public MtsIpotekaPage clickListHousingType(){
        $(HOUSE_TYPE).click();
        $(LIST_HOUSE_TYPE).click();
        return this;
    }

    public MtsIpotekaPage writeBuyProperty(String city){
        $(CITY_BUY_PROPERTY).sendKeys(city);
        $(LIST_CITY).click();
        return this;
    }

    @SneakyThrows
    public MtsIpotekaPage writePriceHome(String priceHome){
        $(PRICE_HOME).clear();
        Thread.sleep(2000);
        $(PRICE_HOME).sendKeys(priceHome);
        return this;
    }

    @SneakyThrows
    public MtsIpotekaPage writeDownPayment(String downPayment){
        $(DOWN_PAYMENT).clear();
        Thread.sleep(2000);
        $(DOWN_PAYMENT).sendKeys(downPayment);
        return this;
    }

    @SneakyThrows
    public MtsIpotekaPage writeCreditTerm(String creditTerm){
        $(CREDIT_TERM).clear();
        Thread.sleep(2000);
        $(CREDIT_TERM).sendKeys(creditTerm);
        return this;
    }

    public MtsIpotekaPage checkSumCredit (){
        $(SUM_CREDIT).shouldHave(Condition.text(sumCredit));
        return this;
    }

    public MtsIpotekaPage checkTermCredit (){
        $(TERM_CREDIT).shouldHave(Condition.text(termCredit));
        System.out.println("Совпадает срок");
        return this;
    }

}
