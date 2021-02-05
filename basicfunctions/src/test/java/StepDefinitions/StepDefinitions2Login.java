package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.FormPage;
import PageFactory.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions2Login {

	WebDriver driver;
	//récuprer le WebDriver du browser chrome
	public WebDriver GetDriver() {
		String projectPath=System.getProperty("user.dir"); 
		String otherPath="/src/test/resources/Driver/chromedriver.exe";	
		System.setProperty("webdriver.chrome.driver", projectPath + otherPath);
		return driver=new ChromeDriver();
	}
	
	//Passer au constructeur de la ^page Login et Form le driver courant
    LoginPage page=new LoginPage(GetDriver());
  //  FormPage page2=new FormPage(GetDriver());
    
	@Given("the user is in the authentification page")
	public void the_user_is_in_the_authentification_page() {
		System.out.println(" we are inside step: the user is in the authentification page");
         page.GetPage();
	}

	@When("the user type {string} and  {string}")
	public void the_user_type_and(String user, String pass) {
		page.SetUser(user);
		page.SetPass(pass);
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		page.submit();
	}

	@Then("he id redirected to a welcome page")
	public void he_id_redirected_to_a_welcome_page() {
		driver.getCurrentUrl().equals("https://example.testproject.io/web/");
	}

	@Then("find welcome {string}")
	public void find_welcome(String name1) {
		driver.getPageSource().contains(name1);
	}

	@Then("he stills in the same page")
	public void he_stills_in_the_same_page() {
		driver.getCurrentUrl().equals("https://example.testproject.io/web/");
	}

	@Then("get an {string}")
	public void get_an(String errorMsg) {
		driver.getPageSource().contains(errorMsg);
	}

	@Then("quit the browser")
	public void quit_the_browser() {
	    driver.close();
	}
}
