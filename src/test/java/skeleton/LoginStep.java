package skeleton;



import static org.testng.AssertJUnit.assertTrue;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	WebDriver driver; 
	
	@Given("^Thr URL of the aaplication$")
	public void thr_URL_of_the_aaplication() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\a07208trng_b4b.04.24\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 throw new PendingException();
	}

	@When("^user enters (.*) as username$")
	public void user_enters_mercury_as_username(String username) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(username);
	    throw new PendingException();
	}

	@When("^user enters (.*) as password$")
	public void user_enters_mercury_as_password(String password) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(password);
	    throw new PendingException();
	}

	@When("^user click on Submit button$")
	public void user_click_on_Submit_button() throws Throwable {
		driver.findElement(By.name("login")).click();
	    throw new PendingException();
	}

	@Then("^User is valid$")
	public void user_is_valid() throws Throwable {
	
		String title = driver.getTitle();
	   Assert.assertTrue(title.startsWith("Find"));
			
	   System.out.println("Valid User");
	    throw new PendingException();
	}



}
