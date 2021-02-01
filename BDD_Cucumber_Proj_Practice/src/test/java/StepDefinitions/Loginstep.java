package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Loginstep {
	
	WebDriver driver;
	
	@Given("user is on home page for login")
	public void user_is_on_home_page_for_login() {
	   
		driver =new ChromeDriver();
		driver.get("https://example.testproject.io/web/");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
	    
		driver.findElement(By.id("name")).sendKeys("TestUser");
		driver.findElement(By.id("password")).sendKeys("12345");
		
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		driver.findElement(By.id("login")).click();
	    Thread.sleep(3000);
	}

	@And("user navigate to dashboard")
	public void user_navigate_to_dashboard() throws InterruptedException {
	   boolean isdisp=driver.findElement(By.id("logout")).isDisplayed();
	   System.out.println("logout button "+isdisp);
	   Thread.sleep(3000);
	   driver.close();
	  
	}
}
