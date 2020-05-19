package pack1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class Firefox {
	
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.google.com");
	  
	  driver.get("file:///C://LKM//Cucumber//check//Selenium//popup.html");
      driver.manage().timeouts().implicitlyWait (30, TimeUnit.SECONDS);
   driver.findElement(By.name("popup")).click();
   Alert pop = driver.switchTo().alert();
   System.out.println("Alert Text is : " + pop.getText());
   pop.accept();
   
  }
  @BeforeTest
  public void beforeTest() {
	  
		  
		  System.setProperty("webdriver.ie.driver", "C:\\Users\\win-10\\Documents\\shibika\\jnknkj\\driver2\\chromedriver.exe");
		  driver= new InternetExplorerDriver();
		  driver.manage().window().maximize();
		  
	 
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }
  }


