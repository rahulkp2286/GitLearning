package SelTraning;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		String[] itemsReq = {"iphone","Samsung","Nokia","Blackberry"};
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");	
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[value='user']")).isSelected());
		w.until(ExpectedConditions.elementSelectionStateToBe(driver.findElement(By.cssSelector("input[value='user']")), true));
		driver.findElement(By.cssSelector("input[value='user']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[value='user']")).isSelected());
		w.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();		
		WebElement Staticdropdown = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select dropdown = new Select(Staticdropdown);
		dropdown.selectByIndex(2);
		//driver.findElement(By.cssSelector("select[class='form-control'] option[value='consult']")).click();
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.cssSelector("input.btn.btn-info.btn-md")).click();
		System.out.println(w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.my-4"))).getText());
		additems(driver, itemsReq);
		driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
		System.out.println(w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn.btn-success"))).getText());
		
		
		
		
		
		
		
		
	}
	
	public static void additems(WebDriver driver,String[] itemsReq) 
	{
	
	int j = 0;
	//arraylist [ from website product list is placed in itemlist (arraylist) ] 
	List<WebElement> itemslist = driver.findElements(By.cssSelector("h4.card-title"));
	
	//get size of arraylist size is 4 (0,1,2,3)]
		for(int i=0; i<itemslist.size();i++) {
		String[] name = itemslist.get(i).getText().split(" ");
		String FN = name[0].trim();
		
		//convert array into Arraylist for easy search 
		List itemsReqlist = Arrays.asList(itemsReq);
		
			if(itemsReqlist.contains(FN)) {
			j++;
		
			
			driver.findElements(By.xpath("//div[@class='card-footer']/button")).get(i).click();
			
				if(j==itemsReq.length)
				{
				break;
				}
		
		
			}
	
		
		}

	}
}
