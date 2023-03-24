package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtns {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

//        click on the radio button Male
        WebElement maleBtn = driver.findElement(By.cssSelector("input[value='Male']"));
        boolean isEnabledMale = maleBtn.isEnabled();
        System.out.println("the radio button is enable " + isEnabledMale);
        boolean isEnabledMale2 = maleBtn.isDisplayed();
        System.out.println(isEnabledMale2);
        boolean isEnabledMale3 = maleBtn.isSelected();

        System.out.println(isEnabledMale3);
        if(!isEnabledMale3){
            maleBtn.click();
        }
        isEnabledMale3= maleBtn.isSelected();
        System.out.println(isEnabledMale3);
        maleBtn.click();
    }
}
