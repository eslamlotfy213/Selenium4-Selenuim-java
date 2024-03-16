package selenuim4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocator_below {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));



        WebElement dataofbirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));


        //dh el submit button  >  driver.findElement(with(By.tagName("input"))
        //below dh t7t dh WebElement dataofbirth = driver.findElement(By.cssSelector("[name='name']"));

       driver.findElement(with(By.tagName("input")).below((dataofbirth))).click();


         driver.close();

    }
}
