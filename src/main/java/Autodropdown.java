import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Autodropdown {


    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        List<WebElement> options  = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for(WebElement option :options){
            if (option.getText().equalsIgnoreCase("India")){
                option.click();
                break;
            }
        }




        driver.close();
        driver.quit();
    }
}
