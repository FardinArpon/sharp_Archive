import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class Elements extends SetUp{

    @Test
    public void footer() throws IOException, InterruptedException {
        driver.get("https://sharparchive.devxhub.com/");
        wait = new WebDriverWait(driver, 10);

        WebElement n = driver.findElement(By.xpath("//p[contains(text(),'Product')]"));
        // Javascript executor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView (true);", n);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[contains(text(),'Industries')]")).click();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(3000);

        WebElement o = driver.findElement(By.xpath("//p[contains(text(),'Product')]"));
        // Javascript executor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView (true);", o);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[contains(text(),'About Us')]")).click();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(3000);

        WebElement p = driver.findElement(By.xpath("//p[contains(text(),'Product')]"));
        // Javascript executor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView (true);", p);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[contains(text(),'FAQ')]")).click();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(3000);

        WebElement q = driver.findElement(By.xpath("//p[contains(text(),'Product')]"));
        // Javascript executor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView (true);", q);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'(888) 346-7890')]")).click();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(3000);

        WebElement r = driver.findElement(By.xpath("//p[contains(text(),'Product')]"));
        // Javascript executor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView (true);", r);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[contains(text(),'Terms & Conditions')]")).click();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(3000);

        WebElement m = driver.findElement(By.xpath("//p[contains(text(),'Product')]"));
        // Javascript executor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView (true);", m);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[contains(text(),'Privacy Policy')]")).click();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(3000);



    }

}
