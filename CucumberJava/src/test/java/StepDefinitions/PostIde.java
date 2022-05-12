package StepDefinitions;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostIde {
	
	
	WebDriver driver = null;
	@Given("browser for post and delete Ide is open")
	public void browser_for_post_and_delete_Ide_is_open() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is:" + projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	@When("user is on home page for login2")
	public void user_is_on_home_page_for_login2() {
		driver.navigate().to("https://stockbit.com/");
	}

	@Then("user click tab Login2")
	public void user_click_tab_Login2() {
		driver.findElement(By.xpath("//a[@class='login-ldn']")).click();
	}

	@When("user enters login2 data")
	public void user_enters_login2_data() {
		 driver.findElement(By.id("username")).sendKeys("asdasd");
		 driver.findElement(By.id("password")).sendKeys("asdasd");
	}

	@Then("user click button Login2")
	public void user_click_button_Login2() {
		driver.findElement(By.id("loginbutton")).click();
	}
	
	@And("user click button skip")
	public void user_click_button_skip() {
		driver.findElement(By.xpath("//button[@class='ant-btn skip-btn ant-btn-lg']")).click();
	}
	
	@When("user enter ide")
	public void user_enter_ide() {
		 byte[] array = new byte[7]; // length is bounded by 7
		    new Random().nextBytes(array);
		    String generatedString = new String(array, Charset.forName("UTF-8"));
		driver.findElement(By.xpath("//span[@class='stream-compose-write-text-revamp']")).click();
		driver.findElement(By.xpath("//textarea[@id='composetextarea']")).sendKeys(generatedString);
	}

	@Then("user click button post")
	public void user_click_button_post() {
		driver.findElement(By.xpath("//button[@class='compose-submit-button postid-undefined ']")).click();
	}
	
}
