import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class AutomationPractice
{


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

//        Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
        driver.findElement(By.cssSelector("input[id*='Option1']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='Option1']")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='Option1']")).isSelected());


        driver.findElement(By.cssSelector("input[id*='Option1']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='Option1']")).isSelected());
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='Option1']")).isSelected());



//        How to get the Count of number of check boxes present in the page
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

        // Get the count of checkboxes
        int checkboxCount = checkboxes.size();


        int expectedcheckbox= 3;
        int actualcheckbox = checkboxCount;
        Assert.assertEquals(actualcheckbox,expectedcheckbox);
        driver.quit();

    }


}
