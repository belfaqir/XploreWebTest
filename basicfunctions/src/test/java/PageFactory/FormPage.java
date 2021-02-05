package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FormPage {

	@FindBy(id="name")
	WebElement slct_country;
	@FindBy(id="country")
	WebElement txt_address;
	@FindBy(id="address")
	WebElement txt_email;
	@FindBy(id="email")
	WebElement txt_phone;
	@FindBy(id="phone")
	WebElement btn_logout;
	@FindBy(id="logout")
	WebElement btn_save;
	@FindBy(id="save")
	
//	Select listCountry =new Select(slct_country);
	
	WebDriver  driver;
	public FormPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	public void SetCountry(String country) {
//		listCountry.selectByVisibleText(country);
//	}
	public void SetAdress(String address) {
		txt_address.sendKeys(address);
	}

	public void SetEmail(String email) {
		txt_email.sendKeys(email);
	}
	public void SetPhone(String phone) {
		txt_phone.sendKeys(phone);
	}
	public void Logout() {
		btn_logout.click();
	}
	public void Save() {
		btn_save.click();
	}
	public String GatUrl() {
		return driver.getCurrentUrl();
	}
	public boolean FindWelcome(String name1) {
		return driver.getPageSource().contains(name1);
	}
}

