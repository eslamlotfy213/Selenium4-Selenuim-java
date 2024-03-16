package windowsHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WindowsHanding {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        driver.findElement(By.cssSelector(".blinkingText")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentId= it.next(); // grap 0 index for parent
        String childId = it.next();
        driver.switchTo().window(childId);

        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());


        String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

        driver.switchTo().window(parentId);
        driver.findElement(By.id("username")).sendKeys(emailId);
    }

}
