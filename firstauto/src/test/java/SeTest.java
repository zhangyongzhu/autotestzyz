import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * 10  * 类说明
 * 11  *
 * 12  * @author iceb
 * 13  * @version $Id: SeTest.java, v0.1 2017/6/28.17:19 Exp $
 * 14
 */

public class SeTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("用例执行前打印本句！");
        System.out.println("每条Test用例是互不相干的");
        System.out.println("用例开始执行…………");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("用例结束后运行");
    }

    @Test
    public void actions() throws InterruptedException {
        //设置驱动所在位置
        System.setProperty("webdriver.chrome.driver", "D:\\firstauto\\drivers\\chromedriver.exe");
        //引用火狐浏览器驱动
        ChromeOptions opiions=new ChromeOptions();
        opiions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(opiions);
        //打开禅道界面
        driver.get("http://www.baidu.com");
        driver.findElement(By.id("kw")).sendKeys("love you");
        driver.findElement(By.id("su")).click();
        TimeUnit.SECONDS.sleep(10);
        driver.close();
    }

}