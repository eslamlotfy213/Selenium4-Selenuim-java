package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class PerformScrollingwithintable {


    //xpath td[4]
    //css selector td:nth(4)
    //travesl css selector parent  child
    // convert string to integer


    public static void main(String[] args)
    {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");



        // scroll to table
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");



        //get cells of table
        int sum=0;
         List<WebElement>values = driver.findElements(By.cssSelector(".tableFixHead  td:nth-child(4)"));
        for (int i = 0; i < values.size(); i++)
        {
            sum = sum+Integer.parseInt(values.get(i).getText());
            System.out.println(Integer.parseInt(values.get(i).getText()));
            System.out.println(sum);
            //convert string to integer // Integer.parseInt()
        }


        String totalAmount = driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[0].trim();
        int ammout = Integer.parseInt(totalAmount);
        System.out.println(ammout);

        Assert.assertEquals(sum,ammout);

    }
}
