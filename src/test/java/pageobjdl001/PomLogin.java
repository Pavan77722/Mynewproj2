package pageobjdl001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLogin {
	WebDriver driver;
	public PomLogin(WebDriver driver) { 
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

//Identify the elements
@FindBy(xpath="//a[@id='login-link']//icon//*[name()='svg']")
WebElement login;
@FindBy(xpath="//input[@placeholder='User']")
WebElement Username;
@FindBy(xpath="//input[@placeholder='Password']")
WebElement Password1;
@FindBy(xpath="//span[text()='Submit']")
WebElement Submitbutton;


//Perform Actions
public void setlogin() {
	  login.click();
}
public void  setUsername(String Uname) {
	  Username.sendKeys(Uname);
  }
public void setPassword(String Pword) {
	Password1.sendKeys(Pword);
}

public void setsubmitbuttonn() {
	Submitbutton.click();
}	
}