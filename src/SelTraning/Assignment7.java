package SelTraning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js =  (JavascriptExecutor)driver; //casting driver to javascript executor
		js.executeScript("window.scroll(0,500)");	// window level scrolling 	
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000"); //within table level srcolling [document  refers to DOM, and query selector  is referred to css selector in Javascript]
	
		WebElement table = driver.findElement(By.cssSelector(".table-display")); //find table on Web page
		
		//row count 
		List<WebElement>tableColumn = table.findElements(By.cssSelector("th"));
		int countCol = tableColumn.size();
		System.out.println("Column count is : "+countCol);
		
		//column count
		List<WebElement>tableRow = table.findElements(By.cssSelector("tr"));
		int countRow = tableRow.size();
		System.out.println("Row count is : "+countRow);
		
		
		
		String secoundRow = table.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText();
		
		
		//extract 2nd row data 
		for(int i=0;i<tableRow.size();i++) {
			
			
			String secondRowData = tableRow.get(i).getText();
			
			if(secondRowData.equalsIgnoreCase(secoundRow))
			{
				System.out.println("Second row data is : "+secondRowData);
			}
			
			
		}
		
		String fourthRow = driver.findElement(By.cssSelector("[id='product'] tr:nth-child(5) td:nth-child(2)")).getText();
		//System.out.println(driver.findElement(By.cssSelector("[id='product'] tr:nth-child(5) td:nth-child(2)")).getText());
		
		
		for(int j=0;j<tableRow.size();j++) {
			
			String fourthRowData = tableRow.get(j).getText().split("Shetty")[1].trim().split("20")[0].trim();
		
		

			
			System.out.println(fourthRowData);
			
			if(fourthRowData.contains(fourthRow))
			{
				System.out.println("fourth row data is : "+fourthRowData);
			}
			
			
		}
		
		
	}

}


/*
 * *************************R S example ***************
 * /

/*
 * import java.util.Iterator;



import java.util.List;



import java.util.Set;



import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;



import org.openqa.selenium.chrome.ChromeDriver;



public class A3 {



public static void main(String[] args) {



// TODO Auto-generated method stub







System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");



WebDriver driver=new ChromeDriver();



driver.get("http://qaclickacademy.com/practice.php");



WebElement table=driver.findElement(By.id("product"));



System.out.println(table.findElements(By.tagName("tr")).size());



System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());



List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));



System.out.println(secondrow.get(0).getText());



System.out.println(secondrow.get(1).getText());



System.out.println(secondrow.get(2).getText());

}

}





*/
