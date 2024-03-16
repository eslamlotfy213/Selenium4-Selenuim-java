import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;


public class Selenuim {

    public static void main(String[] args) throws InterruptedException {

       WebDriver driver = new ChromeDriver();
       driver.get("https://rahulshettyacademy.com/locatorspractice/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       String url= driver.getCurrentUrl();
       System.out.println(url);
       driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("ABC");
       driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123");
       driver.findElement(By.className("submit")).click();
       String erro=    driver.findElement(By.cssSelector("p.error")).getText();
       System.out.println(erro);
       driver.findElement(By.linkText("Forgot your password?")).click();

       Thread.sleep(1000);
       driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("ABC");
       driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("eee@com");
       driver.findElement(By.xpath("//form/input[3]")).sendKeys("99999");
       driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
       System.out.println(driver.findElement(By.cssSelector("form p")).getText());
       String passText=  getPassword(driver);

       //return back
        driver.findElement(By.xpath("//button[contains(@class,'go')]")).click();
        driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("input#inputUsername")).clear();
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(passText);
        driver.findElement(By.cssSelector("input[type*='pass']")).clear();
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

        Thread.sleep(2000);
        String actual=  driver.findElement(By.tagName("p")).getText();
        Assert.assertEquals(actual,"You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello rahulshettyacademy,");

        driver.close();
        driver.quit();
    }


    public static String getPassword(WebDriver driver) throws InterruptedException

    {
//
//        driver.get("https://rahulshettyacademy.com/locatorspractice/");
//
//        driver.findElement(By.linkText("Forgot your password?")).click();
//
//        Thread.sleep(1000);
//
//        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

        String passwordText =driver.findElement(By.cssSelector("form p")).getText();

        //Please use temporary password 'rahulshettyacademy' to Login.

                String[] passwordArray = passwordText.split("'");

        // String[] passwordArray2 = passwordArray[1].split("'");

        // passwordArray2[0]

                String password = passwordArray[1].split("'")[0];

                return password;

        //0th index - Please use temporary password

        //1st index - rahulshettyacademy' to Login.

        //0th index - rahulshettyacademy

        //1st index - to Login.





    }



}
