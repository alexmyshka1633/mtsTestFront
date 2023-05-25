package pages.web_mobile;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MtsIpAndSmallBusniessPageMob {

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

    public MtsIpAndSmallBusniessPageMob clickPayrollProject(){
        $(PAYROLL_PROJECT).click();
        return this;
    }
    public MtsIpAndSmallBusniessPageMob clickButtonFurther(){
        $(BUTTON_APLICATION).click();
        return this;
    }

    public MtsIpAndSmallBusniessPageMob checkWarningMassage(){
        String actualMessage = $(MASSAGE_WARNING).getText();
        actualMessage.equals(expectedMessage);
        System.out.println("Все отлично предупреждение написано");
        return this;
    }

    public MtsIpAndSmallBusniessPageMob getNumberOfEmplpyess (String number){
        $(NUMBER_OF_EMPLOYESS).sendKeys(number);
        return this;
    }

    public MtsIpAndSmallBusniessPageMob getPhone(String phone){
        $(PHONE).sendKeys(phone);
        return this;
    }

    public MtsIpAndSmallBusniessPageMob getEmail(String email){
        $(EMAIL).sendKeys(email);
        return this;
    }

    public MtsIpAndSmallBusniessPageMob getNameOrgasination(String NameOrgasination){
        $(NAME_ORGANISATION).sendKeys(NameOrgasination);
        return this;
    }

    public MtsIpAndSmallBusniessPageMob getFio(String fio){
        $(FIO).sendKeys(fio);
        return this;
    }

    public MtsIpAndSmallBusniessPageMob clickCheckBox(){
        $(CHECK_BOX).click();
        return this;
    }
    public MtsIpAndSmallBusniessPageMob clickSubmitAnApplication(){
        $(SUBMIT_AN_APPLICATION).click();
        return this;
    }

    public MtsIpAndSmallBusniessPageMob checkApplicationSucceful(){
        String actualAplication = $(APPLICATION_SUCCESSFULLY).getText();
        actualAplication.equals(expectedApplication);
        System.out.println("Заявка успешна отправлена");
        return this;
    }
}

