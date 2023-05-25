package pages.web_desktop;

        import com.codeborne.selenide.Selenide;
        import lombok.SneakyThrows;
        import org.junit.Assert;
        import org.openqa.selenium.By;

        import java.io.File;

        import static com.codeborne.selenide.Selenide.$;
        import static com.codeborne.selenide.Selenide.switchTo;
        import static com.codeborne.selenide.WebDriverRunner.closeWindow;import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class MtsCartPage {
 public final By NAME_CART = By.xpath("(//h2)[3]");
 public final By O_CART = By.xpath("(//*[text()='О карте'])[3]");
 public final By NAME_CART2 = By.xpath("//h1");
 public final By TARIF_AND_DOCUMENT = By.xpath("//*[text()='Тарифы и документы']");
 public final By PDF_DOCUMENT_CREDIT_CART = By.xpath("//*[text()='Тариф по кредитной карте МТС Деньги Zero с 01.08.2022']");

 @SneakyThrows
 public void testCreditCard() {
  String expectedName = $(NAME_CART).getText();
  System.out.println(expectedName);
  $(O_CART).click();
  String actualName = $(NAME_CART2).getText();
  System.out.println(actualName);
  Assert.assertTrue(expectedName.toUpperCase().contains(actualName.toUpperCase()));
  $(TARIF_AND_DOCUMENT).click();
  String currentHandle = getWebDriver().getWindowHandle();
  $(PDF_DOCUMENT_CREDIT_CART).click();
  switchTo().window(1);
  File downloadedFile = Selenide.download(expectedName);
  Assert.assertTrue(downloadedFile.exists());
  closeWindow();
  switchTo().window(currentHandle);
 }
}
