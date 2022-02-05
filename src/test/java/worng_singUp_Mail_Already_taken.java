import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class worng_singUp_Mail_Already_taken extends SetUp {

    @Test
    public void mail_Already_taken() throws InterruptedException {
        driver.get("https://sharparchive.devxhub.com/");
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.tagName("button"))).sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(By.tagName("button"))).sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='first_name']"))).sendKeys("Fardin");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='last_name']"))).sendKeys("Arpon");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']"))).sendKeys("kyrah.jennasis@alldrys.com");

        //show status
        Thread.sleep(5000);
        String text = driver.findElement(By.xpath("//div[contains(text(),'This email is already taken')]")).getText();
        Assert.assertTrue(text.contains("This email is already taken"));

    }





}
