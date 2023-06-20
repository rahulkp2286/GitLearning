package SelTraning;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Rahul"	);
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("rahul@mail.com");
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("abcd");
		
		//	System.out.println(driver.findElement(By.id("exampleCheck1")).isEnabled());
		
		Assert.assertFalse(driver.findElement(By.id("exampleCheck1")).isSelected());
		Thread.sleep(2000);
		driver.findElement(By.id("exampleCheck1")).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.id("exampleCheck1")).isSelected());
		Thread.sleep(2000);
		
		WebElement Sdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(Sdropdown);
		dropdown.selectByIndex(0);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		Assert.assertFalse(driver.findElement(By.id("inlineRadio1")).isSelected());
		Thread.sleep(2000);
		driver.findElement(By.id("inlineRadio1")).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.id("inlineRadio1")).isSelected());
		
		driver.findElement(By.cssSelector("input[name = 'bday']")).sendKeys("1986-02-02");
		
		driver.findElement(By.cssSelector("input[type = 'submit']")).click();
		
		//System.out.println(driver.findElement(By.tagName("strong")).getText());
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
	}

}
