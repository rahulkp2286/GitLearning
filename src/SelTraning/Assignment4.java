package SelTraning;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String checkName = "ctl00_mainContent_chk_SeniorCitizenDiscount";
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://the-internet.herokuapp.com/");
				
				System.out.println(driver.findElement(By.linkText("Multiple Windows")).getText());
				driver.findElement(By.linkText("Multiple Windows")).click();
				driver.findElement(By.linkText("Click Here")).click();
				
				Set<String> windows = driver.getWindowHandles();
				Iterator<String> iterator = windows.iterator();				
				String parentId =iterator.next();				
				String childId = iterator.next();
				
				driver.switchTo().window(childId);
				System.out.println(driver.findElement(By.cssSelector("h3")).getText());
				
				driver.switchTo().window(parentId);
				System.out.println(driver.findElement(By.cssSelector("h3")).getText());
				
				
				

	}

}
