package selenuim4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocator_left {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));




        //click on check box relative to left

        WebElement icecreamtext  = driver.findElement(By.cssSelector("[for='exampleCheck1']"));

        driver.findElement(with(By.tagName("input")).toLeftOf(icecreamtext)).click();

    }
}
