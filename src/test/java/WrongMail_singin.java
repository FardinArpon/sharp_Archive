import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WrongMail_singin extends SetUp{

    @Test
    public void singin_with_WrongMail() throws InterruptedException {
        driver.get("https://sharparchive.com/");
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='inline-block']"))).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='email']"))).sendKeys("kymari.kevianalldrys.com@");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']"))).sendKeys("Arpon@123456");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        String text = driver.findElement(By.xpath("//p[contains(text(),'Email is Invalid!')]")).getText();
        Assert.assertTrue(text.contains("Email is Invalid!"));
        Thread.sleep(5000);
    }
}
