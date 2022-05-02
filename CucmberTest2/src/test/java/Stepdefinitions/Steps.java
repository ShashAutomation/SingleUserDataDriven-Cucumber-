package Stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	WebDriver driver;
	@Given("User in google home page")
	public void user_in_google_home_page() {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium projects\\seleniumtestngprojects\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
	    
	}

	@Given("google title test")
	public void google_title_test() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}

	@When("user in facebook home page")
	public void user_in_facebook_home_page() {
		driver.navigate().to("https://www.facebook.com/");
		boolean b=driver.findElement(By.xpath("//button[@name='login']")).isDisplayed();
		 Assert.assertTrue(b);
	}

	@When("facebook title test")
	public void facebook_title_test() throws InterruptedException {
	    System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	    Thread.sleep(2000);
	}

	


		@When("^user enters \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
		public void user_enters_details(String firstname,String lastname,
				String reg_email__, String reg_email_confirmation__, String reg_passwd__ )
		{
			
		    driver.findElement(By.name("firstname")).sendKeys(firstname);
		    driver.findElement(By.name("lastname")).sendKeys(lastname);
		    driver.findElement(By.name("reg_email__")).sendKeys(reg_email__);
		    driver.findElement(By.name("reg_email_confirmation__")).sendKeys(reg_email_confirmation__);
		    driver.findElement(By.name("reg_passwd__")).sendKeys(reg_passwd__);
		    Select day=new Select(driver.findElement(By.name("birthday_day")));
		    day.selectByIndex(14);
		    Select month=new Select(driver.findElement(By.name("birthday_month")));
		    month.selectByIndex(9);
		    Select year=new Select(driver.findElement(By.name("birthday_year")));
		    year.selectByVisibleText("1997");
		    driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']//input[@name='sex'and @value='2']")).click();
		}
		

		@Then("user clicks submit")
		public void user_clicks_submit() {
			driver.findElement(By.name("websubmit")).click();
			driver.close();

	}
}
