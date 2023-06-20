package SelTraning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	
	//css Selector :  in Console to check : $('p.error')
	//class Name -> Tagname.classname ex: Button.signInBtn
	
	//ID -> Tagname#id ex: input#InputUsername
	
	//cutomize syntax :Tagname[attribue='value'] 
	//cutomize css with index : Tagname[attribue='value']:nth-child(index)
	
	//parent to child traverse : parentTagname childTagname ex of css : form p
	
	//html code ex :  <input type="text" placeholder="Username" value="">
	//ex: Input[placeholder='Username']
	
	 //----
	//Xpath : in Console to check : $x('//input[@placeholder="Username"]')		
	// //Tagname[@attribute='value'] ex: //input[@placeholder='Username']
	// ex 2: cutomize xpath with index : //Tagname[@attribue='value'][index]
	//parent to child traverse xpath  : //parentTagname/childTagname ex : //form/p
	
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");

	
	driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	driver.findElement(By.name("inputPassword")).sendKeys("rahul123");
	driver.findElement(By.className("signInBtn")).click();
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	
	driver.findElement(By.linkText("Forgot your password?")).click(); 
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rahul@agm.com");

	driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
	driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
	driver.findElement(By.xpath("//form/input[3]")).sendKeys("3848930022");
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	//driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	driver.findElement(By.cssSelector("div button:nth-child(1)")).click();
	// xpath  //form/div //button[contains(@class,'login')]
	Thread.sleep(1000);
	
	driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	//regular expression above ex for css  : Tagname[attribute*='constant value']	
	driver.findElement(By.id("chkboxOne")).click();
	driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	//regular expression above ex for xpath : //Tagname[contains(@attribute,'constant value')]
	
	
	
	
	
}

}
