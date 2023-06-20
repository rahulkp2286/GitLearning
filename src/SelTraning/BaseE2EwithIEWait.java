package SelTraning;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseE2EwithIEWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));

		String[] itemsReq = { "Cucumber", "Cauliflower", "Brocolli", "Carrot" }; //Array

		Thread.sleep(3000);
		addItems(driver, itemsReq);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		//Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");	
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//Explicit wait 
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		

	}

	public static void addItems(WebDriver driver, String[] itemsReq) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		// we use size() method to get the size of Arraylist
		for (int i = 0; i < products.size(); i++) {

			
			// format the name to get the actual product name

			String[] name = products.get(i).getText().split("-");
			// Brocolli - 1 Kg
						// name[0] : "Brocolli " - we need this value [to remove space (rightmost or leftmost white space) use trim() method]
						// name[1] : " 1 Kg" 
						// format the name to get the actual product name
			String formattedName = name[0].trim();

			// convert array into Arraylist for easy search
			// check whether name you expected is present in array "itemReg" or not

			List itemsReqlist = Arrays.asList(itemsReq);

			// if (name.contains("Cucumber"))

			if (itemsReqlist.contains(formattedName)) {

				j++;
				// click add to cart button
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// driver.findElements(By.xpath("//button[text()='ADD TO
				// CART']")).get(i).click();
				// break;

				
				//if(j==3) 
				// we use length method to get the Size of Array!
				if (j == itemsReq.length)
				{
					break;
				}
			}
		}

	}
}
