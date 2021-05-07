import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstTestClass {
    WebDriver driver;
    @BeforeTest
    void beforTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Konsultant\\IdeaProjects\\SeleniumTestng\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    void firstTest() {
        driver.navigate().to("http://the-internet.herokuapp.com/");
        By checkboxes = By.partialLinkText("Checkboxes");
        WebElement checkboxesLink = driver.findElement(checkboxes);
       checkboxesLink.click();
        By checked = By.xpath("//input[1]");
        WebElement checked1 = driver.findElement(checked);
        checked1.click();
        boolean boo =  checked1.isSelected();
        Assert.assertEquals(boo=true,"Pierwszy checkbox został zaznaczony");
    }

    @Test
    void secondTest(){
        driver.navigate().to("http://the-internet.herokuapp.com/");
        By checkboxes = By.partialLinkText("Checkboxes");
        WebElement checkboxesLink = driver.findElement(checkboxes);
        checkboxesLink.click();
        By checked2 = By.xpath("//input[2]");
        WebElement checked3 = driver.findElement(checked2);
        boolean boo2 = checked3.isSelected();
        if (boo2=true){System.out.println("Drugi checkbox był zaznaczony");
        }
        else{
            System.out.println("Drugi checkbox  nie był zaznaczony");
        }
        checked3.click();
        boolean boo3 = checked3.isSelected();
        Assert.assertEquals(boo3=true,"Drugi checkbox został odznaczony");

    }
        @AfterTest
                void afterTest(){
            driver.close();
            driver.quit();
        }
    }

