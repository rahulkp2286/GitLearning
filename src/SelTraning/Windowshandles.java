package SelTraning;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> windows = driver.getWindowHandles();  // [parentid,childid]{set collection} //get all ids od window
		Iterator<String> it = windows.iterator(); //help to iterate thr windows {set colelction}
		String parentId = it.next(); //before next it is outside of iterator, as soon as next is appears it get parent id index 
		String childId = it.next(); // as soon as next is appears it get child id index
		
		driver.switchTo().window(childId);
		
//		String sentence = driver.findElement(By.cssSelector(".im-para.red")).getText();
//		System.out.println(sentence);
//		
//		String[] String1 = sentence.split("at");		
//		System.out.println(String1[1].trim());
//		
//		String firstIndexValue = String1[1].trim();
//		String[] actualEmail = firstIndexValue.split(" ");
//		System.out.println(actualEmail[0].trim());
//		String email = actualEmail[0].trim();
		
		String email = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(parentId);
		
		driver.findElement(By.id("username")).sendKeys(email);
		
		
		
	}

}
