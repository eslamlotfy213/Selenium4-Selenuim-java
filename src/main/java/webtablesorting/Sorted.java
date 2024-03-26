package webtablesorting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class Sorted {


    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");


        driver.findElement(By.xpath("//tr/th[1]")).click();


        List<WebElement> elementslist = driver.findElements(By.xpath("//tr/td[1]"));
        List<String> originamList =   elementslist.stream().map(s->s.getText()).collect(Collectors.toList());

        List<String> sortedList =   originamList.stream().sorted().collect(Collectors.toList());

        //compare original with sorted list
        Assert.assertEquals(originamList,sortedList);



        driver.quit();

    }
}
