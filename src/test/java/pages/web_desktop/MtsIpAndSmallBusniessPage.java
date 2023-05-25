package pages.web_desktop;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MtsIpAndSmallBusniessPage {

    String expectedMessage = "Поле обязательно для заполнения";
    String expectedApplication = "Ваша заявка успешно отправлена";
    public final By PAYROLL_PROJECT = By.xpath("//*[@href='/malomu-biznesu/zarplatniy-proekt/']");
    public final By BUTTON_APLICATION = By.xpath("//*[text()='Отправить заявку']");
    public final By MASSAGE_WARNING = By.xpath("//*[text()='Поле обязательно для заполнения']");
    public final By NUMBER_OF_EMPLOYESS = By.xpath("//*[@placeholder='Введите количество']");
    public final By PHONE = By.xpath("//input[@placeholder='+7 000 000-00-00']");
    public final By EMAIL = By.xpath("//input[@placeholder='mail@example.ru']");
    public final By NAME_ORGANISATION = By.xpath("//input[@placeholder='Введите название компании']");
    public final By FIO = By.xpath("//input[@placeholder='Иванов Иван Иванович']");
    public final By CHECK_BOX = By.xpath("//*[@class='CheckIconWrapper-sc-cb89gg-2 laHSjE']");
    public final By SUBMIT_AN_APPLICATION = By.xpath("//*[text()='Отправить заявку']");
    public final By APPLICATION_SUCCESSFULLY = By.xpath("/h1[@data-testid='heading']");

    public MtsIpAndSmallBusniessPage clickPayrollProject(){
        $(PAYROLL_PROJECT).click();
        return this;
    }
    public MtsIpAndSmallBusniessPage clickButtonFurther(){
        $(BUTTON_APLICATION).click();
        return this;
    }

    public MtsIpAndSmallBusniessPage checkWarningMassage(){
        String actualMessage = $(MASSAGE_WARNING).getText();
        actualMessage.equals(expectedMessage);
        System.out.println("Все отлично предупреждение написано");
        return this;
    }

    public MtsIpAndSmallBusniessPage getNumberOfEmplpyess (String number){
        $(NUMBER_OF_EMPLOYESS).sendKeys(number);
        return this;
    }

    public MtsIpAndSmallBusniessPage getPhone(String phone){
        $(PHONE).sendKeys(phone);
        return this;
    }

    public MtsIpAndSmallBusniessPage getEmail(String email){
        $(EMAIL).sendKeys(email);
        return this;
    }

    public MtsIpAndSmallBusniessPage getNameOrgasination(String NameOrgasination){
        $(NAME_ORGANISATION).sendKeys(NameOrgasination);
        return this;
    }

    public MtsIpAndSmallBusniessPage getFio(String fio){
        $(FIO).sendKeys(fio);
        return this;
    }

    public MtsIpAndSmallBusniessPage clickCheckBox(){
        $(CHECK_BOX).click();
        return this;
    }
    public MtsIpAndSmallBusniessPage clickSubmitAnApplication(){
        $(SUBMIT_AN_APPLICATION).click();
        return this;
    }

    public MtsIpAndSmallBusniessPage checkApplicationSucceful(){
        String actualAplication = $(APPLICATION_SUCCESSFULLY).getText();
        actualAplication.equals(expectedApplication);
        System.out.println("Заявка успешна отправлена");
        return this;
    }
}

