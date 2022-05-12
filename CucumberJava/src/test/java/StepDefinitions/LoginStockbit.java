package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStockbit {
	WebDriver driver = null;
	
	@Given("browser for login is open")
	public void browser_for_login_is_open() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is:" + projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	@When("user is on home page for login")
	public void user_is_on_home_page_for_login() {
		 driver.navigate().to("https://stockbit.com/");
	}

	@Then("user click tab Login")
	public void user_click_tab_Login() {
		driver.findElement(By.xpath("//a[@class='login-ldn']")).click();
	}

	@When("user enters login data")
	public void user_enters_login_data() {
		 driver.findElement(By.id("username")).sendKeys("asdasd");
		 driver.findElement(By.id("password")).sendKeys("asdasd");
	}

	@Then("user click button Login")
	public void user_click_button_Login() {
		driver.findElement(By.id("loginbutton")).click();
	}
}
