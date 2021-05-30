import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddRemoveElementsPage {
    private WebDriver driver;
    public AddRemoveElementsPage(WebDriver driver){
        this.driver = driver;
    }


        public String getTextFromHeader(){
            return driver.findElement(By.xpath("//h3[text()='Add/Remove Elements']")).getText();
        }
public void clickOnAddElements(){driver.findElement(By.xpath("//div[@id='content']/div/button")).click();
}

public String addElementHeader(){
            return driver.findElement(By.xpath("//div[@id='content']/div/button")).getText();
}
public void deleteClickButton(){driver.findElement(By.xpath("//div[@id=\"elements\"]/button")).click();
}
public String deleteButton(){
        return driver.findElement(By.xpath("//div[@id=\"elements\"]/button")).getText();
}
}
