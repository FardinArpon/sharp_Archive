

import junit.extensions.TestSetup;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WrongPass_signIn extends SetUp {

    @Test
    public void singin_with_WrongPassword() throws InterruptedException {
        driver.get("https://sharparchive.com/");
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='inline-block']"))).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='email']"))).sendKeys("kymari.kevian@alldrys.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']"))).sendKeys("aArpon@123456");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).sendKeys(Keys.ENTER);
        String text = driver.findElement(By.xpath("//p[contains(text(),'Password is Invalid!')]")).getText();
        Assert.assertTrue(text.contains("Password is Invalid!"));
        Thread.sleep(5000);
    }
}
