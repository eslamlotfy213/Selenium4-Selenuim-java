package selenuim4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static  org.openqa.selenium.support.locators.RelativeLocator.*;


import java.time.Duration;

public class RelativeLocator_above {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));



        WebElement editbox = driver.findElement(By.cssSelector("[name='name']"));


        //first find the tagname elly howa label 3n tarqe el editbox elly howa above
        System.out.println(driver.findElement(with(By.tagName("label")).above(editbox)).getText());




      //  driver.close();

    }
}
