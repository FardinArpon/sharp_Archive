import org.junit.Assert;
import org.junit.Test;


public class Get_Title extends SetUp{

    @Test
    public void getTitle() {
        driver.get("https://sharparchive.devxhub.com/");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.contains("Sharp Archive"));
    }
}

