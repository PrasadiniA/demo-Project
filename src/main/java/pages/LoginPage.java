package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    By txtuserName = By.xpath("//input[@name='uid']");
    By txtpassword = By.xpath("//input[@name='password']");
    By lbltitleText = By.className("barone");
    By btnlogin = By.name("btnLogin");

    public void setUserName(String userName){
        driver.findElement(txtuserName).sendKeys(userName);
    }

    public void setPassword(String password){
        driver.findElement(txtpassword).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(btnlogin).click();
    }

    public String getLoginTitleLogin(){
        return driver.findElement(lbltitleText).getText();
    }

    public void login(String userName, String password){
        this.setUserName(userName);
        this.setUserName(password);
        this.clickLogin();
    }
}
