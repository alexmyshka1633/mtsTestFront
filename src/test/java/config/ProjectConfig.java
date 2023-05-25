package config;

import org.aeonbits.owner.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Config.Sources("classpath:config/local.properties")
public interface ProjectConfig extends Config {
    @Key("base_url")
    String baseUrl();
}


