import io.qameta.allure.Allure;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import tests.web_desktop.*;
import tests.web_mobile.*;

import java.io.IOException;

public class TestRunner {
    public static void main(String[] args) throws IOException {
        Result resultDesktop = JUnitCore.runClasses(
                MtsCreditCartZero.class,
                MtsSocalMediaLink.class,
                MtsPayrollProject.class,
                MtsOfficeAndAtmMap.class,
                MtsMortgageСosttInCalculator.class
        );

        Result resultMobile = JUnitCore.runClasses(
                MtsCreditCartZeroMob.class,
                MtsSocalMediaLinkMob.class,
                MtsPayrollProjectMob.class,
                MtsOfficeAndAtmMapMob.class,
                MtsMortgageСosttInCalculatorMob.class
        );

        generateAllureReport(resultDesktop, "Десктопная версия");
        generateAllureReport(resultMobile, "Мобильная версия");

        openAllureReportInBrowser();
    }

    private static void generateAllureReport(Result result, String version) {
        for (Failure failure : result.getFailures()) {
            Allure.addAttachment("Ошибка", failure.getTrace());
        }

        Allure.addDescription("Количество успешных тестов: " + (result.getRunCount() - result.getFailureCount()));
        Allure.addDescription("Общее количество тестов: " + result.getRunCount());
        Allure.addDescription("Процент успешных тестов: " + ((result.getRunCount() - result.getFailureCount()) * 100.0 / result.getRunCount()) + "%");

    }

    private static void openAllureReportInBrowser() throws IOException {
        String reportPath = System.getProperty("user.dir") + "/allure-report/index.html";
        Runtime.getRuntime().exec("cmd /c start " + reportPath);
    }
}
