package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStockbit {
	
	WebDriver driver = null;
	@Given("browser for search is open")
	public void browser_for_search_is_open() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is:" + projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	
	@When("user is on home page for login3")
	public void user_is_on_home_page_for_login3() {
		driver.navigate().to("https://stockbit.com/");
	}

	@Then("user click tab Login3")
	public void user_click_tab_Login3() {
		driver.findElement(By.xpath("//a[@class='login-ldn']")).click();
	}

	@When("user enters login3 data")
	public void user_enters_login3_data() {
		 driver.findElement(By.id("username")).sendKeys("asdasd");
		 driver.findElement(By.id("password")).sendKeys("asdasd");
	}

	@Then("user click button Login3")
	public void user_click_button_Login3() {
		driver.findElement(By.id("loginbutton")).click();
	}

	@And("user click button skip2")
	public void user_click_button_skip2() {
		driver.findElement(By.xpath("//button[@class='ant-btn skip-btn ant-btn-lg']")).click();
	}

	@When("user enters search data")
	public void user_enters_search_data() {
	driver.findElement(By.xpath("//span[@class='stream-compose-write-text-revamp']")).click();
	driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-search_global']")).sendKeys("BBCA");
	}

	@Then("user click enter")
	public void user_click_enter() {
		WebElement textbox = driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-search_global']"));
		textbox.sendKeys(Keys.ENTER);
	}
}
