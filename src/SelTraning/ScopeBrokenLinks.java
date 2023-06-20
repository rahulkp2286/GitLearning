package SelTraning;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ScopeBrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
		
		//step 1 :  get all the url's tied up to the links using Selenium 
		//step 2 : java methods will call url's and get you the status code of url
		//step 3 : if status code > 400 then that url is not working  - > 'link' which tied up to url is broken
				
		

		WebElement footerDriver = driver.findElement(By.id("gf-BIG")); 	  		// Limiting WebDriver Scope	to footer section only 	
		List<WebElement> links = footerDriver.findElements(By.tagName("a"));	// findElements(By.cssSelector("li[class='gf-li'] a")
		System.out.println(footerDriver.findElements(By.tagName("a")).size());  //findElements - size
	
//		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
//		System.out.println(links.size()); 
		SoftAssert a = new SoftAssert();
		
		for(WebElement link:links) {
			String url = link.getAttribute("href");
			HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
			
			connection.setRequestMethod("HEAD");  //get, post, delete, add, head 
			connection.connect();
			int responseCode = connection.getResponseCode(); //200,401,404,500
			
			System.out.println(responseCode);
			//Soft Assert : will not fail Test case 
			a.assertTrue(responseCode<400, "The Link with Text "+link.getText()+" is broken with code "+responseCode);
			
			
			//Hard Assert : will fail test case 
			//Assert.assertTrue(responseCode<400, "The Link with Text "+link.getText()+" is broken with code "+responseCode);
			/*
		 	if(responseCode>400) {
			 
				
				System.out.println("The Link with Text "+link.getText()+" is broken with code "+responseCode); 
				Assert.assertTrue(false);
			}
			*/		
			
		}
		a.assertAll(); // will report failure 
		
		
		//String url = driver.findElement(By.cssSelector("a[href*='soap']")).getAttribute("href"); //200
		//String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href"); //404
				
		//		URL a = new URL(url);
		//		HttpURLConnection connection = (HttpURLConnection)a.openConnection();
		
		/*
		HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
		
		connection.setRequestMethod("HEAD");  //get, post, delete, add, head 
		connection.connect();
		int responseCode = connection.getResponseCode(); //200,401,404,500
		
		System.out.println(responseCode);
		*/
		
	}

}
