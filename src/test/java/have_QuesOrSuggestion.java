import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class have_QuesOrSuggestion extends SetUp{
    @Test
    public void Qus_or_Suggestion() throws IOException, InterruptedException {
        driver.get("https://sharparchive.devxhub.com/");
        wait = new WebDriverWait(driver, 10);
        WebElement n = driver.findElement(By.xpath("//b[contains(text(),'Communication')]"));
        // Javascript executor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView (true);", n);
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("About & F")).sendKeys(Keys.ENTER);
        Boolean Industry = driver.findElement(By.xpath("//h1[contains(text(),'About')]")).isDisplayed();
        Assert.assertEquals(Industry, true);



        WebElement x = driver.findElement(By.xpath("//h1[contains(text(),'About')]"));
        // Javascript executor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView (true);", x);
        Thread.sleep(3000);

        wait.until(ExpectedConditions.elementToBeClickable(By.tagName("textarea"))).sendKeys("I have a question");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='email']"))).sendKeys("fardin@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);


    }
}
