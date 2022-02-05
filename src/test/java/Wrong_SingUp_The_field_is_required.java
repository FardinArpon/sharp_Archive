import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wrong_SingUp_The_field_is_required extends SetUp {
    @Test
    public void The_field_is_required() throws InterruptedException {
        driver.get("https://sharparchive.devxhub.com/");
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.tagName("button"))).sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='first_name']"))).sendKeys("Fardin");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='last_name']"))).sendKeys("Arpon");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']"))).sendKeys("a1124@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#password"))).sendKeys("DevXhub12345@");
//        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#business_name"))).sendKeys("DevXHubzone");
//        wait.until(ExpectedConditions.elementToBeClickable(By.tagName("select"))).click();
//        Select option = new Select(driver.findElement(By.tagName("select")));
//        option.selectByValue("Education");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@class='inline-flex']//input[@type='checkbox']"))).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Next')]"))).click();
        //show status
        Thread.sleep(5000);
        String text = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]")).getText();
        Assert.assertTrue(text.contains("The field is required"));
    }
}
