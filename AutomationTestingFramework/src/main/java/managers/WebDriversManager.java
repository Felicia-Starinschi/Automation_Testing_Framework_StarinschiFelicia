package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriversManager {

    public WebDriversManager(int webDriverType){
        this.webDriverType = webDriverType;
    }
    private WebDriver driver;

    private int webDriverType;

    private WebDriver createDriver(){
        switch (webDriverType){
            case 1:
                System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
                break;
            case 2:
                System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Your option is not available");
        }
        return  driver;
    }

    public WebDriver getDriver(){
        if(driver == null){
            createDriver();
        }
        return driver;
    }

    public  void closeDriver(){
        if (driver != null){
            driver.close();
            System.out.println("Driver has been closed.");
        }
    }

}
