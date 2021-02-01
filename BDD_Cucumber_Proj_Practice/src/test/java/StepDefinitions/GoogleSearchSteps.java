package StepDefinitions;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import javax.crypto.KeyAgreementSpi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {

	WebDriver driver=null;
	@Given("User is open browser")
	public void user_is_open_browser() {
		
		String usrdir= System.getProperty("user.dir");
		System.out.println("dir..."+usrdir);
		
		//System.setProperty("webdriver.chrome.driver", usrdir+"/src/test/resource/drivers/chromedriver");  
		driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		System.out.println("User open browser");
	}

	@When("User is on google serach page")
	public void user_is_on_google_serach_page() {
		
		driver.get("https://www.google.com/");		
		System.out.println("User is in Serach page");
	}

	@And("User enters search value in search textbox")
	public void user_enters_search_value_in_search_textbox() {
		System.out.println("User enter some text in searchbox"); 
		driver.findElement(By.name("q")).sendKeys("step by step automation");
	}

	@And("user hit enter")
	public void user_hit_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		System.out.println("User click on enter");
	}

	@And("User is navigate to search results screen")
	public void user_is_navigate_to_search_results_screen() throws InterruptedException {
		System.out.println("User is able to view ");
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
