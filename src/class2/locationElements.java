package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locationElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //send in username
        driver.findElement(By.id("email")).sendKeys("Tania");
        //send the pass
        driver.findElement(By.name("pass")).sendKeys("kdjksfksj");
        //click on the button create new account
        driver.findElement(By.linkText("Create new account")).click();
        //click on forgotten pass
        driver.findElement(By.partialLinkText("password?")).click();

        driver.quit();
    }
}
