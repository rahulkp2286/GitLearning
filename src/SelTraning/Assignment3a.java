package SelTraning;

import java.lang.reflect.Array;
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

public class Assignment3a {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

		String[] itemsReq = { "iphone", "Samsung", "Nokia", "Blackberry" };
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.cssSelector("[id=username]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("[id=password]")).sendKeys("learning");

		driver.findElement(By.cssSelector("input[value='user']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".modal-body p")));
		System.out.println(driver.findElement(By.cssSelector(".modal-body p")).getText());
		Assert.assertTrue(true, driver.findElement(By.cssSelector(".modal-body p")).getText());
		driver.findElement(By.cssSelector(".btn-success")).click();
		WebElement dropDown = driver.findElement(By.xpath("//select[@class='form-control']"));
		// dropDown.click();
		Select dropDownValues = new Select(dropDown);
		dropDownValues.selectByValue("consult");
		driver.findElement(By.cssSelector("input#terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".btn-primary"))));
		addItemToCart(driver, itemsReq);
		driver.findElement(By.cssSelector(".btn-primary")).click();
		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".btn-success"))));
		// driver.close();

	}

	public static void addItemToCart(WebDriver driver, String[] itemsReq) {
		int j = 0;
		List<WebElement> cardTitleList = driver.findElements(By.cssSelector(".card-title"));

		for (int i = 0; i < cardTitleList.size(); i++) {
			String[] itemName = cardTitleList.get(i).getText().split(" ");
			String formattedItemName = itemName[0].trim();
			System.out.println(formattedItemName);

			List itemNeededtoCart = Arrays.asList(itemsReq);

			if (itemNeededtoCart.contains(formattedItemName)) {
				j++;
				
					driver.findElements(By.cssSelector(".btn-info")).get(i).click();
					
				if (j == itemsReq.length) {
					break;
				}

			}

		}

	}

}
