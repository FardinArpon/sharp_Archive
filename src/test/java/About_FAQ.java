import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class About_FAQ extends SetUp{
    @Test
    public void About_QA() throws IOException, InterruptedException {
        driver.get("https://sharparchive.devxhub.com/");
        wait = new WebDriverWait(driver, 10);
        WebElement n = driver.findElement(By.xpath("//b[contains(text(),'Communication')]"));
        // Javascript executor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView (true);", n);
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("About & F")).sendKeys(Keys.ENTER);
        Thread.sleep(8000);
        Boolean Industry = driver.findElement(By.xpath("//h1[contains(text(),'About')]")).isDisplayed();
        Assert.assertEquals(Industry, true);
    }
}

