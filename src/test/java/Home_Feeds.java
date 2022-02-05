import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Feeds extends SetUp{
   @Test
    public void feeds_add() throws InterruptedException {
        driver.get("https://sharparchive.com/");
       //driver.get("https://sharparchive.devxhub.com/");

       wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='inline-block']"))).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='email']"))).sendKeys("kymari.kevian@alldrys.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']"))).sendKeys("Arpon@123456");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).sendKeys(Keys.ENTER);
        Thread.sleep(2000);

       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']"))).sendKeys("kymari.kevian@alldrys.com");
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).sendKeys(Keys.ENTER);
       Thread.sleep(3000);
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Finish')]"))).sendKeys(Keys.ENTER);
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).sendKeys(Keys.ENTER);
       Thread.sleep(1000);

       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/section[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]"))).sendKeys(Keys.ENTER);
       Thread.sleep(3000);

   }


    @Test
    public void NoSearch() throws InterruptedException {
//        driver.get("https://sharparchive.com/");
        driver.get("https://sharparchive.devxhub.com/");

        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='inline-block']"))).click();
        Thread.sleep(3000);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='email']"))).sendKeys("kymari.kevian@alldrys.com");
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']"))).sendKeys("Arpon@123456");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/section[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]"))).sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(By.tagName("input"))).sendKeys("dp");
        Thread.sleep(5000);
        Boolean status = driver.findElement(By.xpath("//p[contains(text(),'Learning.DevXhub')][@class='text-xl bigScreen:hidden largeDesktop:block hidden']")).isDisplayed();
        Assert.assertEquals(status, false);

    }
}
