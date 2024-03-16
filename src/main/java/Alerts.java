import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.time.Duration;

public class Alerts {


    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.id("name")).sendKeys("eslam");

        driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
        String text= driver.switchTo().alert().getText();
        System.out.println(text);
        driver.switchTo().alert().accept();


        //Confirm
        driver.findElement(By.cssSelector("input[value='Confirm']")).click();
        String text2= driver.switchTo().alert().getText();
        System.out.println(text2);
        driver.switchTo().alert().dismiss();





        driver.close();
    }

}
