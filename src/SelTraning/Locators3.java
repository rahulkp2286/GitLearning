package SelTraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// identify sibling locator with xpath traverse
		
		// ex broken down :   //header/div/button[1]/following-sibling::button[1]
		
		// parent to traverse  -> //header/div/button[1]
		//sibling to sibling   ->  /following-sibling::button[1]
		
		//identify from child element to parent element with xpath 
		//ex broken down : //header/div/button[1]/parent::div/parent::header/a
		
		// parent to traverse -> //header/div/button[1] 	
		//child to parent  -> // /parent::div
		//parent(child) to grandparent(parent)  ->  /parent::header
		//grandparent(parent) to child  ->  /a 
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		//  //header/div/button[1] // parent to child ; 
		//  /following-sibling:: sibling of button;
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());

	}

}
