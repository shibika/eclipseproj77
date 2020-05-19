package pack1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
 
	WebDriver driver;
	
  @Test
  public void launchgoogle() {
	  driver.get("https://www.google.com");
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
