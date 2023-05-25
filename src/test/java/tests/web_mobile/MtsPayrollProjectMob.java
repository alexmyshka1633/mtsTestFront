package tests.web_mobile;

import org.junit.jupiter.api.Test;
import pages.web_desktop.MtsHomePage;
import pages.web_desktop.MtsIpAndSmallBusniessPage;
import pages.web_mobile.MtsHomePageMob;
import pages.web_mobile.MtsIpAndSmallBusniessPageMob;

public class MtsPayrollProjectMob {


    String phone = "9998887766";
    String email = "test@testing.com";
    String number = "10";
    String nameOrganisation = "Testt";
    String fio = "Иванов Иван Тестиров";
    MtsHomePageMob mtsHomePageMob = new MtsHomePageMob();
    MtsIpAndSmallBusniessPageMob mtsIpAndSmallBusniessPageMob = new MtsIpAndSmallBusniessPageMob();

    @Test
    public void playrollProject(){

        mtsHomePageMob.openMtsHomePage()
                .clickIpAndSmallBusiness();

        mtsIpAndSmallBusniessPageMob.clickPayrollProject()
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
