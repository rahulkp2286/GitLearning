package SelTraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String checkName = "ctl00_mainContent_chk_SeniorCitizenDiscount";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
		System.out.println(driver.findElement(By.linkText("Nested Frames")).getText());
		driver.findElement(By.linkText("Nested Frames")).click();
		//System.out.println(driver.findElements(By.tagName("frameset")).size()); 
		//ystem.out.println(driver.findElements(By.tagName("frame")).size()); 
		driver.switchTo().frame(("frame-top"));
		driver.switchTo().frame(("frame-middle"));
		
		System.out.println(driver.findElement(By.id("content")).getText());
	}

}
