import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;

public class Assignment {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


       // .form-control.ng-pristine.ng-invalid.ng-touched
        driver.findElement(By.name("name")).sendKeys("rahul");


        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("email");

      driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("password");


      Boolean ischecked =false;
      Assert.assertFalse(driver.findElement(By.id("exampleCheck1")).isSelected());

      if (ischecked==false){

          System.out.println("checkbox is not checked");
      }else {

          System.out.println("checkbox is checked");
      }

        driver.findElement(By.id("exampleCheck1")).click();
        ischecked=true;
        Assert.assertTrue(driver.findElement(By.id("exampleCheck1")).isSelected());

        if (ischecked==false){

            System.out.println("checkbox is not checked");
        }else {
            System.out.println("checkbox is checked");
        }

        WebElement AllGender = driver.findElement(By.id("exampleFormControlSelect1"));
        Select Gender = new Select(AllGender);
        Gender.selectByVisibleText("Male");



        driver.findElement(By.id("inlineRadio2")).click();


        driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("10102022");


        driver.findElement(By.cssSelector("input[type='submit']")).click();


        String message =  driver.findElement(By.cssSelector(".alert-success")).getText();

        System.out.println(message);


        driver.close();
        driver.quit();
    }
}
