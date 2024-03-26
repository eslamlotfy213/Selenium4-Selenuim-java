package webtablesorting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class LiveDemo2 {


    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");


        driver.findElement(By.xpath("//tr/th[1]")).click();
        List<WebElement> elementslist = driver.findElements(By.xpath("//tr/td[1]"));


        List<String> price = elementslist.stream().filter(s->s.getText().contains("Beans"))
                .map(s->getPriceVeggie(s)).collect(Collectors.toList());

        price.forEach(a-> System.out.println(a));

    }

    private static String getPriceVeggie(WebElement s) {

    return  s.findElement(By.xpath("following-sibling::td[1]")).getText();
    }


}
