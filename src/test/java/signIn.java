import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class signIn extends SetUp {


    @Test
    public void singUp() throws InterruptedException {
        driver.get("https://sharparchive.devxhub.com/");
        wait = new WebDriverWait(driver, 10);

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//header/nav[1]/button[2]/span[1]"))).click();
          Thread.sleep(3000);
//         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='email']"))).sendKeys("kyrah.jennasis@alldrys.com");
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']"))).sendKeys("123ab");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).sendKeys(Keys.ENTER);
        Thread.sleep(20000);

    }
}
