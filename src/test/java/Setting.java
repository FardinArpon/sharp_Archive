import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Setting extends SetUp {
    @Test
    public void setting() throws InterruptedException {
        //driver.get("https://sharparchive.com/");
        driver.get("https://sharparchive.devxhub.com/");

        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='inline-block']"))).click();
        Thread.sleep(3000);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='email']"))).sendKeys("kymari.kevian@alldrys.com");
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']"))).sendKeys("Arpon@123456");
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).sendKeys(Keys.ENTER);

//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']"))).sendKeys("kymari.kevian@alldrys.com");
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).sendKeys(Keys.ENTER);
//        Thread.sleep(3000);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Finish')]"))).sendKeys(Keys.ENTER);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).sendKeys(Keys.ENTER);
//        Thread.sleep(2000);

//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/section[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]"))).sendKeys(Keys.ENTER);
//        Thread.sleep(3000);

        WebElement mainMenu = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/section[1]/div[1]/div[1]/div[1]/div[2]/div[3]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu).perform();
        //Thread.sleep(3000);

        WebElement subMenu = driver.findElement(By.xpath("//p[contains(text(),'Archive')]"));
        WebElement subMenu2 = driver.findElement(By.xpath("//p[contains(text(),'Search')]"));
        WebElement subMenu3 = driver.findElement(By.xpath("//p[contains(text(),'Settings')]"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
        actions.moveToElement(subMenu2);
        actions.click().build().perform();
        actions.moveToElement(subMenu3);
        actions.click().build().perform();
        Thread.sleep(2000);


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section/div[1]/div[2]/div/section/div[1]/div/div[1]/div[2]/div/div[1]"))).click();
        Thread.sleep(3000);

//        //--------------------organize-------------------------//

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section/div[1]/div[2]/div/section/div[1]/div/div[1]/div[1]/div/div[1]/button"))).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section/div[1]/div[2]/div/section/div[1]/div/div[1]/div[2]/div/div[3]"))).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section/div[1]/div[2]/div/section/div[1]/div/div[2]/div/div[1]/div[3]/button"))).click();
        driver.findElement(By.xpath("//*[@id='newgroup']")).sendKeys("Automatic Create");
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[1]/div[2]/div/section/section[4]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[1]/div[2]/div/section/section[4]/div/div/div[2]/div/div/button[2]/div")).click();
        Thread.sleep(3000);

        //--------------------System-------------------------//

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section/div[1]/div[2]/div/section/div[1]/div/div[1]/div[2]/div/div[4]"))).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section/div[1]/div[2]/div/section/div[1]/div/div[2]/section/div[1]/div[1]/div[2]/div/div[1]/div/select"))).click();
        Select option = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/section/div[1]/div[2]/div/section/div[1]/div/div[2]/section/div[1]/div[1]/div[2]/div/div[1]/div/select")));
        option.selectByValue("dd MMM yyyy");
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section/div[1]/div[2]/div/section/div[1]/div/div[2]/section/div[1]/div[1]/div[2]/div/div[2]/div/select"))).click();
        Select option2 = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/section/div[1]/div[2]/div/section/div[1]/div/div[2]/section/div[1]/div[1]/div[2]/div/div[2]/div/select")));
        option2.selectByValue("pp");
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section/div[1]/div[2]/div/section/div[1]/div/div[2]/section/div[1]/div[1]/div[2]/div/div[3]/div/select"))).click();
        Select option3 = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/section/div[1]/div[2]/div/section/div[1]/div/div[2]/section/div[1]/div[1]/div[2]/div/div[3]/div/select")));
        option3.selectByValue("Europe/Paris");
        Thread.sleep(1000);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section/div[1]/div[2]/div/section/div[1]/div/div[2]/section/div[1]/span/button"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section/div[1]/div[2]/div/section/div[4]/div/div[1]/div[2]/div[1]/div/div[2]/label"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section/div[1]/div[2]/div/section/div[4]/div/div[1]/div[2]/div[2]/div/select"))).click();
        Select option4 = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/section/div[1]/div[2]/div/section/div[4]/div/div[1]/div[2]/div[2]/div/select")));
        option4.selectByValue("3 months");
        Thread.sleep(1000);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section/div[1]/div[2]/div/section/div[4]/div/div[2]/div/button"))).click();
        Thread.sleep(3000);


        //--------------------Account-------------------------//

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section/div[1]/div[2]/div/section/div[1]/div/div[1]/div[2]/div/div[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section/div[1]/div[2]/div/section/div[1]/div/div[2]/section/div[1]/div[2]/div[3]/div/button[3]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section/div[1]/div[2]/div/section/div[7]/div/div/div[2]/table/tbody/tr/td[2]/svg/path"))).click();




    }
}
