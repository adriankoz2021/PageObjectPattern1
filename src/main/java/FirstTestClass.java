import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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
    void beforTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Konsultant\\IdeaProjects\\SeleniumTestng\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void ExplicitWaitTest() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 2);
        driver.navigate().to("http://the-internet.herokuapp.com/");

        WebElement element = driver.findElement(By.xpath("//h1[text()='Welcome to the-internet']"));

        webDriverWait.until(ExpectedConditions.visibilityOf(element));
        WebElement elementAdd = driver.findElement(By.xpath("//ul/li[2]/a"));
        elementAdd.click();
        WebElement addHeader = driver.findElement(By.xpath("//h3[text()='Add/Remove Elements']"));
        webDriverWait.until(ExpectedConditions.visibilityOf(addHeader));
        WebElement addElementClick = driver.findElement(By.xpath("//div[@id='content']/div/button"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(addElementClick));
        addElementClick.click();
        WebElement delete = driver.findElement(By.xpath("//div[@id=\"elements\"]/button"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(delete));
        delete.click();
        webDriverWait.until(ExpectedConditions.invisibilityOf(delete));

    }

    @AfterTest
    void afterTest() {
        driver.close();
        driver.quit();
    }
}


