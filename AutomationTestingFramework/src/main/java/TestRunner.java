import managers.WebDriversManager;

public class TestRunner {
    public static void main(String[] args){
        WebDriversManager webDriversManager = new WebDriversManager(1);
        webDriversManager.getDriver().get("https://www.google.com/");
        webDriversManager.closeDriver();
    }
}
