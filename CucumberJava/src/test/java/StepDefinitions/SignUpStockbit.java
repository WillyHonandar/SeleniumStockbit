package StepDefinitions;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpStockbit {
	
	WebDriver driver = null;
	
	@Given("browser for sign up is open")
	public void browser_for_sign_up_is_open() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is:" + projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	@When("user is on home page for sign up")
	public void user_is_on_home_page_for_sign_up() {
		 driver.navigate().to("https://stockbit.com/");
	}

	@Then("user click button Mulai Berinvestasi")
	public void user_click_button_Mulai_Berinvestasi() {
		driver.findElement(By.xpath("//a[@class='home-btn start-investing']")).click();
	}
	
	@And("user click button Register with Email")
	public void user_click_button_Register_with_Email() {
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		    
		driver.findElement(By.xpath("//a[@class='loginlogin register-email']")).click();
	}

	@When("user enters data")
	public void user_enters_data() {
	    driver.findElement(By.id("input-1")).sendKeys("User Test");
	    driver.findElement(By.id("input-2")).sendKeys("usertest@gmai.com");
	    driver.findElement(By.id("input-3")).sendKeys("UserTest");
	    driver.findElement(By.id("input-4")).sendKeys("usertest123");
	    driver.findElement(By.id("input-5")).sendKeys("usertest123");
	}

	@Then("user click button Register")
	public void user_click_button_Register() {
		driver.findElement(By.xpath("//input[@value='Register']")).click();
	}

	@When("user enters phone number")
	public void user_enters_phone_number() {
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("81234567890");
	}

	@Then("user click button Send Verification Code")
	public void user_click_button_Send_Verification_Code() {
		driver.findElement(By.xpath("//input[@value='Send Verification Code']")).click();
	}

}
