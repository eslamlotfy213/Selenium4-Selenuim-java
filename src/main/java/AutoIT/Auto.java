package AutoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

public class Auto {




    public static void main(String[] args) throws IOException, InterruptedException {


        String downloadPath=System.getProperty("user.dir")+"\\src\\main\\java\\AutoIT";
        System.out.println(downloadPath);
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadPath);
        ChromeOptions options=new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.ilovepdf.com/pdf_to_jpg");
        driver.findElement(By.id("pickfiles")).click();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("D:\\Selenium4\\Selenuim-java\\src\\main\\java\\AutoIT\\fileupload.exe");


        // click on convert button
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("processTaskTextBtn")));
        driver.findElement(By.id("processTaskTextBtn")).click();


        // click on download button
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download JPG images")));
        driver.findElement(By.linkText("Download JPG images")).click();


        //check if the file is downloaded or not
        Thread.sleep(5000);

        File f=new File(downloadPath+"\\ilovepdf_pages-to-jpg.zip");
        if(f.exists()) {
            System.out.println("File found");
            Assert.assertTrue(f.exists());
            if (f.delete()){
                System.out.println("File is deleted");
            }
        }


        driver.quit();
    }
}
