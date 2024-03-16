package mouseevents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionmouse {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.eg/");



        Actions actions = new Actions(driver);

         // write capital letter using shift
        actions.moveToElement(driver.findElement(By.id("twotabsearchtextbox")))
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("hello")
                .build()
                .perform();


        // write capital letter using shift
        actions.moveToElement(driver.findElement(By.id("twotabsearchtextbox")))
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("hello 2")
                .doubleClick()
                .build()
                .perform();

        // move to mouse
        actions.moveToElement(driver.findElement(By.cssSelector("a[id=nav-link-accountList]")))
                .build()
                .perform();

        // move to mouse right click  >>>> contextClick
        actions.moveToElement(driver.findElement(By.cssSelector("a[id=nav-link-accountList]")))
                .contextClick()
                .build()
                .perform();

        //driver.close();
    }






}
