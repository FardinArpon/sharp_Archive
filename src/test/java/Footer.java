import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class Footer extends SetUp{

    @Test
    public void footer() throws IOException, InterruptedException {
    driver.get("https://sharparchive.devxhub.com/");
    wait = new WebDriverWait(driver, 10);
    WebElement n = driver.findElement(By.xpath("//p[contains(text(),'Product')]"));
    // Javascript executor
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView (true);", n);
    Thread.sleep(2000);

    driver.findElement(By.xpath("//p[contains(text(),'Product')]"));
    driver.findElement(By.xpath("//p[contains(text(),'Resources')]"));
    driver.findElement(By.xpath("//p[contains(text(),'Company')]"));
    driver.findElement(By.xpath("//p[contains(text(),'Contact Us')]"));

    Boolean product = driver.findElement(By.xpath("//p[contains(text(),'Product')]")).isDisplayed();
    Assert.assertEquals(product, true);


    Boolean Resources = driver.findElement(By.xpath("//p[contains(text(),'Product')]")).isDisplayed();
    Assert.assertEquals(Resources, true);

    Boolean Company = driver.findElement(By.xpath("//p[contains(text(),'Product')]")).isDisplayed();
    Assert.assertEquals(Company, true);


    Boolean Contact = driver.findElement(By.xpath("//p[contains(text(),'Contact Us')]")).isDisplayed();
    Assert.assertEquals(Contact, true);

    }
}
