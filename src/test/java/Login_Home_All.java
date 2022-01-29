import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Home_All extends SetUp {

    @Test
    public void Login_Home_All() throws InterruptedException {

      // driver.get("https://sharparchive.com/");
        driver.get("https://sharparchive.devxhub.com/");
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='inline-block']"))).click();
        Thread.sleep(3000);

//       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='email']"))).sendKeys("kymari.kevian@alldrys.com");
//       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']"))).sendKeys("Arpon@123456");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).sendKeys(Keys.ENTER);
        Thread.sleep(2000);

//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']"))).sendKeys("kymari.kevian@alldrys.com");
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).sendKeys(Keys.ENTER);
//        Thread.sleep(3000);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Finish')]"))).sendKeys(Keys.ENTER);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).sendKeys(Keys.ENTER);
//        Thread.sleep(5000);

        WebElement mainMenu = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/section[1]/div[1]/div[1]/div[1]/div[2]/div[3]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu).perform();
        //Thread.sleep(3000);

        WebElement subMenu = driver.findElement(By.xpath("//p[contains(text(),'Archive')]"));
        WebElement subMenu2 = driver.findElement(By.xpath("//p[contains(text(),'Search')]"));
        WebElement subMenu3 = driver.findElement(By.xpath("//p[contains(text(),'Settings')]"));
        Thread.sleep(3000);
        actions.moveToElement(subMenu);
        actions.click().build().perform();
        Thread.sleep(3000);
        actions.moveToElement(subMenu2);
        actions.click().build().perform();
        Thread.sleep(3000);
        actions.moveToElement(subMenu3);
        actions.click().build().perform();
        Thread.sleep(2000);

     }

}
