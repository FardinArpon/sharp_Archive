import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Help extends SetUp{

    @Test
    public void archive() throws InterruptedException {
        //driver.get("https://sharparchive.com/");
        driver.get("https://sharparchive.devxhub.com/");

        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='inline-block']"))).click();
        Thread.sleep(3000);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='email']"))).sendKeys("kymari.kevian@alldrys.com");
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']"))).sendKeys("Arpon@123456");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).sendKeys(Keys.ENTER);
        //Thread.sleep(2000);

//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']"))).sendKeys("kymari.kevian@alldrys.com");
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).sendKeys(Keys.ENTER);
//        Thread.sleep(3000);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Finish')]"))).sendKeys(Keys.ENTER);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).sendKeys(Keys.ENTER);
//        Thread.sleep(2000);

//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/section[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]"))).sendKeys(Keys.ENTER);
//        Thread.sleep(3000);


//------------------------------Archive---------------------------//


        WebElement mainMenu = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/section[1]/div[1]/div[1]/div[1]/div[2]/div[3]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu).perform();
        Thread.sleep(3000);

        WebElement subMenu2 = driver.findElement(By.xpath("//p[contains(text(),'Archive')]"));
        actions.moveToElement(subMenu2);
        actions.click().build().perform();
        Thread.sleep(3000);

        WebElement subMenu3 = driver.findElement(By.xpath("//p[@class='sidemenu__label help pb-2']"));
        actions.moveToElement(subMenu3);
        actions.click().build().perform();
        Thread.sleep(3000);

        driver.findElement(By.tagName("textarea")).sendKeys("I need some help");
        driver.findElement(By.xpath("//button[@class='submit_button button relative']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);



    }
}
