package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class FrameClass {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       // driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
        driver.switchTo().frame(0);

        driver.findElement(By.id("draggable")).click();

        Actions actions = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        actions.dragAndDrop(source,target).build().perform();


        //back to default window
        driver.switchTo().defaultContent();

    }
}
