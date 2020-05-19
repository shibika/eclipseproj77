package com.jnknkj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		
      WebDriver driver;		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\win-10\\Documents\\shibika\\jnknkj\\driver3\\chromedriver.exe");

        driver = new ChromeDriver();
       
        Thread.sleep(7000);

       driver.get("https://www.google.com/");
Thread.sleep(3000);
	}

}

