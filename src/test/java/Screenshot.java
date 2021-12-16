import java.io.File;
import java.io.IOException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/");
        driver.findElement(By.id("navbtn_exercises")).click();
        TakesScreenshot ts= ((TakesScreenshot) driver);
        File file= ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C://Screenshots//image1.jpg"));
        System.out.println("Screenshot saved");
        driver.quit();


    }
}

