import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalidlogin {

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='user-name']"));
        txtUsername.sendKeys("standard");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='password']"));
        txtPassword.sendKeys("secret");

        WebElement btnlogin = driver.findElement(By.xpath("//input[@id='login-button']"));
        btnlogin.click();

    }

}
