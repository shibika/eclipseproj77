package com.jnknkj;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefine {


	WebDriver driver;
	
@Given("User provides valid credentials")
public void user_provides_valid_credentials() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("User provides valid credentials");
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\win-10\\Documents\\shibika\\jnknkj\\driver2\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	System.out.println(driver.getTitle());
	
	driver.findElement(By.name("userName")).sendKeys("demo");
	driver.findElement(By.name("password")).sendKeys("demo");
	
	driver.findElement(By.name("login")).click();
	
	boolean b= driver.findElement(By.linkText("SIGN-OFF")).isDisplayed();
	if (b==true) {
		System.out.println("signin is successful");
	}
	else{
		System.out.println("sign in failed");
	}
	
	driver.findElement(By.xpath(".//input[@value='oneway']")).click();
	//SElect passenger
	driver.findElement(By.xpath(".//select[@name='passCount']")).click();
	driver.findElement(By.xpath(".//select[@name='passCount']/option[@value='2']")).click();
	
	//select DEpart from
	driver.findElement(By.xpath(".//select[@name='fromPort']")).click();
	driver.findElement(By.xpath(".//select[@name='fromPort']/option[@value='London']")).click();
	
	//select from date
	driver.findElement(By.xpath(".//select[@name='fromDay']")).click();
	driver.findElement(By.xpath(".//select[@name='fromDay']/option[@value='1']")).click();
	
	driver.findElement(By.xpath(".//select[@name='toDay']")).click();
	driver.findElement(By.xpath(".//select[@name='toDay']/option[@value='18']")).click();
	
	//select destination place
	driver.findElement(By.xpath(".//select[@name='toPort']")).click();
	driver.findElement(By.xpath(".//select[@name='toPort']/option[@value='Portland']")).click();
	
	//select to date
	driver.findElement(By.xpath(".//select[@name='toMonth']")).click();
	driver.findElement(By.xpath(".//select[@name='toMonth']/option[@value='3']")).click();
	
	driver.findElement(By.xpath(".//select[@name='toDay']")).click();
	driver.findElement(By.xpath(".//select[@name='toDay']/option[@value='18']")).click();
	
	//select airline
	driver.findElement(By.xpath(".//select[@name='airline']")).click();
	driver.findElement(By.xpath(".//select[@name='airline']/option[text()='Blue Skies Airlines']")).click();
	
	//find flight
	driver.findElement(By.xpath(".//input[@name='findFlights']")).click();
}

@Then("SignIn is successful")
public void signin_is_successful() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("SignIn is successful");
}

		
		@Given("Alex purchase Microwave for {int} dollars")
		public void alex_purchase_Microwave_for_dollars(Integer int1) {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("Alex1 purchase micrivare for dollar"+ int1);
			
			
		}

		@Given("Alex has receipt")
		public void alex_has_receipt() {
		    // Write code here that turns the phrase above into concrete actions	
			System.out.println("Alex1 has receipt");		
			}

		@When("Alex return faulty microwave")
		public void alex_return_faulty_microwave() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("Alex1 return faulty microwave");		
			}

		@Then("Alex should get refund of {int} dollars")
		public void alex_should_get_refund_of_dollars(Integer int1) {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("Alex1 should get refund of dollar"+ int1);		
			}

		@Given("User is at SignIn page")
		public void user_is_at_SignIn_page() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("User provides valid user name and password")
		public void user_provides_valid_user_name_and_password(io.cucumber.datatable.DataTable dataTable) {
		    // Write code here that turns the phrase above into concrete actions
		    // For automatic transformation, change DataTable to one of
		    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		    // Double, Byte, Short, Long, BigInteger or BigDecimal.
		    //
		    // For other transformations you can register a DataTableType.
       List <String> userdat = dataTable.asList();
       System.out.println(userdat.size());
       for (String data : userdat) {
    	   System.out.println(data);
       }

		}

		@Then("User SignIn in success")
		public void user_SignIn_in_success() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}
		
		
	}


