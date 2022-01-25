import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static java.lang.Thread.sleep;

//public class Service extends SetUp{
//    @Test
//    public void gettitel() throws IOException {
//        driver.get("https://www.storerepublic.com/");
//        wait = new WebDriverWait(driver, 10);
////        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div:nth-child(1) nav.navbar_mainNavbar__3dKF2.navbar.navbar-expand-md:nth-child(1) div.navbar_collapseParent__2jvt5.collapse.navbar-collapse ul.navbar-nav > li.nav-item:nth-child(1)"))).click();
//////        Boolean Billing = driver.findElement(By.xpath("//p[contains(text(),'Billing History')]")).isDisplayed();
//////        Assert.assertEquals(Billing, true);
//////        sleep(2000);
////        driver.navigate().back();
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
//
//    }
//}
