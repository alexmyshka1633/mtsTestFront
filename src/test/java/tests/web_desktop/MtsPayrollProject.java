package tests.web_desktop;

import org.junit.jupiter.api.Test;
import pages.web_desktop.MtsHomePage;
import pages.web_desktop.MtsIpAndSmallBusniessPage;

public class MtsPayrollProject {


    String phone = "9998887766";
    String email = "test@testing.com";
    String number = "10";
    String nameOrganisation = "Testt";
    String fio = "Иванов Иван Тестиров";
    MtsHomePage mtsHomePage = new MtsHomePage();
    MtsIpAndSmallBusniessPage mtsIpAndSmallBusniessPage = new MtsIpAndSmallBusniessPage();

    @Test
    public void playrollProject(){

        mtsHomePage.openMtsHomePage()
                .clickIpAndSmallBusiness();

        mtsIpAndSmallBusniessPage.clickPayrollProject()
                .clickButtonFurther()
                .checkWarningMassage()
                .getNameOrgasination(nameOrganisation)
                .getNumberOfEmplpyess(number)
                .getFio(fio)
                .getPhone(phone)
                .getEmail(email)
                .clickCheckBox()
                .clickSubmitAnApplication()
                .checkApplicationSucceful();

    }

}
