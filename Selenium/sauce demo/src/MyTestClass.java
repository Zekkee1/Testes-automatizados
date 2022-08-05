import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTestClass {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lucas\\Documents\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

    }
}
