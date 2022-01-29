import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class TryDemo extends SetUp {

    @Test
    public void tryDemo() throws IOException, InterruptedException {
        driver.get("https://sharparchive.devxhub.com/");
        wait = new WebDriverWait(driver, 10);
        WebElement n = driver.findElement(By.xpath("//b[contains(text(),'Communication')]"));
        // Javascript executor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView (true);", n);

        driver.findElement(By.xpath("//header/nav[1]/div[1]/button[1]")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
}
