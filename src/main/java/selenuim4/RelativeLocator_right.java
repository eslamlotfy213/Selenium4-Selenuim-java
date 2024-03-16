package selenuim4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocator_right {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


     //need to get the text based on radio button


        WebElement radio = driver.findElement(By.id("inlineRadio1"));


       System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radio)).getText());



    }
}
