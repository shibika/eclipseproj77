package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frames {

	WebDriver driver;
	  @Test
	  public void f() {
		  driver.get("https://jqueryui.com/dialog/");
		  
		  int size= driver.findElements(By.tagName("iframe")).size();
		  System.out.println(size);
		  
		  driver.switchTo().frame(0);
		  System.out.println(driver.findElement(By.xpath(".//div[@id='dialog']")).getText());
		  
		  
	  }
	  @BeforeTest
	  public void beforeTest() {
		  
			  
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\win-10\\Documents\\shibika\\jnknkj\\driver2\\chromedriver.exe");
			  driver= new ChromeDriver();
			  driver.manage().window().maximize();
			  
		 
	  }

	  @AfterTest
	  public void afterTest() {
		  
		  driver.close();
	  }
	  }


