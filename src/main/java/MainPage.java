import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.GregorianCalendar;

public class MainPage {
WebDriver driver;
public MainPage (WebDriver driver){
    this.driver = driver;
}
public void clickOnRemoveElementLink(){
  driver.findElement(By.xpath("//ul/li[2]/a")).click();
}

public String welcomeHeader(){
    return driver.findElement(By.xpath("//h1[text()='Welcome to the-internet']")).getText();
}

}
