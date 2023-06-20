package SelTraning;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScopeNewWindowTab {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.TAB); //switch to new tab
		//driver.switchTo().newWindow(WindowType.WINDOW); //switch to new Window
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentWindowId = it.next();
		String childWindowId = it.next();
		driver.switchTo().window(childWindowId);
		
		driver.get("https://www.rahulshettyacademy.com/"); //on new tab window get the url
		
		Thread.sleep(3000);
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		System.out.println(courseName); 
		Thread.sleep(2000);
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.name("name")).sendKeys(courseName);
		
		//WebElement screenshot 
		WebElement name = driver.findElement(By.name("name"));
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("WebElementLogo.png"));
		
		
		/*
		 * Webpage screenshot 
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\Introduction\\src\\TakesScreenshot\\screenshot.png"));
		
		or
		
		TakesScreenshot tss = (TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\Introduction\\src\\TakesScreenshot\\screenshot.png"));
		 */
		
		//get height and width of webelement for UX
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		//driver.quit();
	}

}
