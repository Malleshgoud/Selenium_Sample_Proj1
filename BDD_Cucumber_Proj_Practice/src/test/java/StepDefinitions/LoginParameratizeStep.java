
package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginParameratizeStep {

	WebDriver driver;

	@Given("user is  on Login page")

	public void user_is_on_login_page() 
	{
		driver =new ChromeDriver();
	driver.get("https://example.testproject.io/web/");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ; }

	@When("^user enters (.*) and (.*)$") 
	public void user_enters_username_and_password(String username , String password) throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password); 
		Thread.sleep(3000);
	}

	@And("user clicks on login button in login screen") 
	public void user_clicks_on_login_button_in_login_screen() throws InterruptedException {
		driver.findElement(By.id("login")).click(); Thread.sleep(3000); }

	@And("user navigate to home after successfull login") 
	public void	user_navigate_to_home_after_successfull_login() throws InterruptedException {
		boolean isdisp=driver.findElement(By.id("logout")).isDisplayed();
		System.out.println("logout button "+isdisp); Thread.sleep(2000);
		driver.close(); }

}
