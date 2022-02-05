import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class pricing extends SetUp{
    @Test
    public void pricing() throws IOException, InterruptedException {
        driver.get("https://sharparchive.devxhub.com/");
        wait = new WebDriverWait(driver, 10);
        WebElement n=driver.findElement(By.xpath("//b[contains(text(),'Communication')]"));
        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView (true);", n);
        driver.findElement(By.xpath("//button[contains(text(),'Pricing')]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("69");

       Thread.sleep(3000);


        // body/div[@id='__nuxt']/div[@id='__layout']/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]
        // Boolean Billing = driver.findElement(By.xpath("//button[contains(text(),'Pricing')]")).isDisplayed();
        // Assert.assertEquals(Billing, true);


//        driver.navigate().back();

//
//        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div:nth-child(1) nav.navbar_mainNavbar__3dKF2.navbar.navbar-expand-md:nth-child(1) div.navbar_collapseParent__2jvt5.collapse.navbar-collapse ul.navbar-nav > li.nav-item:nth-child(2)"))).click();
//        driver.navigate().back();
//
//        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("nav.navbar_mainNavbar__3dKF2.navbar.navbar-expand-md:nth-child(1) div.navbar_collapseParent__2jvt5.collapse.navbar-collapse ul.navbar-nav li.nav-item:nth-child(3) > a.navbar_linkStyle__1ZemP.navbar_linkStyle__1ZemP"))).click();
//        driver.navigate().back();
//
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='__next']/nav[1]/div[3]/ul[2]/li[4]/a[1]"))).click();
//        driver.navigate().back();
//
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'CONTACT')]"))).click();
//        driver.navigate().back();

    }
}
