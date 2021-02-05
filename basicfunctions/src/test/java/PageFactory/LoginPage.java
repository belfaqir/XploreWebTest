package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="name")
	WebElement txt_username;
	@FindBy(id="password")
	WebElement txt_password;
	@FindBy(id="login")
	WebElement btn_login;
	WebDriver  driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void SetUser(String user) {
		txt_username.sendKeys(user);
	}
	public void SetPass(String pass) {
		txt_password.sendKeys(pass);
	}
	public void submit() {
		btn_login.click();
	}
	public void GetPage() {
		driver.navigate().to("https://example.testproject.io/");
	}
}
