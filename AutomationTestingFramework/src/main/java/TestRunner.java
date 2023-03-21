import managers.WebDriversManager;

public class TestRunner {
    public static void main(String[] args){
        WebDriversManager webDriverChrome = new WebDriversManager(1);
        webDriverChrome.getDriver().get("https://www.google.com/");
        webDriverChrome.closeDriver();

        WebDriversManager webDriverFirefox= new WebDriversManager(2);
        webDriverFirefox.getDriver().get("https://www.google.com/");
        webDriverFirefox.closeDriver();
    }
}
