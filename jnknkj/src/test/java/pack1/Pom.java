package pack1;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	
	public class Pom {
	 
      WebDriver driver;
	    
	    By Email = By.id("Email");
	    By Password = By.name("Password");
	    By Login = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	    
	    public Pom(WebDriver driver) 
	    {    
	        super();
	        this.driver = driver;
	    }
	    
	    public void typeEmail(String uid)
	    {
	        driver.findElement(Email).sendKeys(uid);
	    }
	    
	    public void typePass(String Pass)
	    {
	        driver.findElement(Password).sendKeys(Pass);
	    }
	    
	    public void ClickLogin()
	    {
	        driver.findElement(Login).click();
	    }
	}
