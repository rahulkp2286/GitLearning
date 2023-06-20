package SelTraning;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class File_AUTO_IT_Up_Down_load {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String downlaodpath = System.getProperty("user.dir"); //get you the path of the project dynamically 
		System.out.println(downlaodpath);  // print the path : C:\Users\RahPoo\OneDrive\Selenium Practice\Introduction
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	
		/****https://chromedriver.chromium.org/capabilities : code is available ****/
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups" , 0);
		chromePrefs.put("download.default_directory", downlaodpath);
		options.setExperimentalOption("prefs", chromePrefs);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); 
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

		driver.get("https://www.freeconvert.com/pdf-to-jpg");
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector(".file-input-dropdown__button__drop"));	
		a.moveToElement(move).click().build().perform();
		
		driver.findElement(By.cssSelector(".file-input-dropdown__list li:nth-child(1)")).click();
		Thread.sleep(3000);
		/*
		 * 1. Au3info - record window component
		 * 2. build script - scite.exe 
		 * 3. save file as - .au3 extension [fileupload.au3]
		 * 4. convert [fileupload.au3] .au3 extension file to .exe by compiling .au3 file using (compiler x86) 
		 * 5. call .exe file with Runtime class in java into your Selenium test
		 */
		Runtime.getRuntime().exec("C:\\Users\\RahPoo\\OneDrive\\Documents\\AutoIT\\fileupload.exe");
		
		
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".file-input-dropdown__action__convert"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".dropdown__toggle.nav-link")));
		WebElement move2 = driver.findElement(By.cssSelector(".dropdown__toggle.nav-link"));
		a.moveToElement(move2).click().build().perform();
		driver.findElement(By.linkText("Save to Device")).click();
		Thread.sleep(5000);
		//File f =  new File("C:\\Users\\RahPoo\\Downloads\\AutoIT_test.jpg");
		File f =  new File(downlaodpath+"/AutoIT_test.jpg");
		if(f.exists()) {
			Assert.assertTrue(f.exists());
			//System.out.println("file found");
			if(f.delete())
				System.out.println("file deleted");
		}
		
		
		
	}

}
		
		
		/*  ***** AUTOIT upload *********
							 * 
							 * Automating window Controls with Selenium:
							 * 
							 * 
							 * 
							 *   Handling Window Authentication Pop Up http://Username:Password@SiteURL
							 * 
							 *   Driver.get();
							 * 
							 * · Handling File Upload from Windows using AutoIT
							 * 
							 * 
							 * What is AutoIT 
							 * Install AutoIT 
							 * AutoIT Scripting 
							 * Integrating AutoIT with Selenium
							 * 
							 * 
							 * 
							 * //Shift focus to the file upload windows
							 * 
							 * //set text/path into file name edit box
							 * 
							 * //click open to upload file
							 * 
							 * 
							 * 
							 * Au3info- record window component objects 
							 * Build Script -scite.exe	 
							 * Save it- .au3 extenstion 
							 * Convert file into .exe by compiling .au3 file 
							 * Call .exe file with Runtime class in java into your selenium tests
							 * 
							 * 
							 * 
							 * 
							 * 
							 * ControlFocus("Open","","Edit1")							  
							 * ControlSetText("Open","","Edit1","C:\Users\rahul\Documents\check\visit.pdf")
							 * ControlClick("Open","","Button1")
							 * 
							 * 
		***** Downloadload ********
							 *code to download the file  - selenium script
							 *Verify if the  file is successfully download
							 *java file package
							 *
							 *dynamically checking the path
							 *1. re - route file checking path to our own project
							 *2. inform chrome browser to download into our own project 
							 
							 */
		

	
