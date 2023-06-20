package SelTraning;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.io.FileUtils;

public class SSLCheck {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions(); //FirefoxOptions, EdgeOptions // imp
		options.setAcceptInsecureCerts(true);
		
		//*******************//
		
		// *** Add the WebDriver proxy capability. ***  // imp
		/*
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("myhttpproxy:3337");
		options.setCapability("proxy", proxy);
		*/
		
		//*******************//
		
		// *** Add a ChromeDriver-specific capability. ***
		/*
		options.addExtensions(new File("/path/to/extension.crx"));
		ChromeDriver driver = new ChromeDriver(options);
		*/
		
		//*******************//
		
		//*** Block pop-up windows *** // imp
		/*
		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("excludeSwitches",

		     Arrays.asList("disable-popup-blocking"));
		*/
		
		
		//*******************//
		
		//*** Set download directory *** 
		/* 
		ChromeOptions options = new ChromeOptions();

		HashMap<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("download.default_directory", "/directory/path");

		options.setExperimentalOption("prefs", prefs);
		*/
		
		//*******************//
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options); //pass options object to chrome driver 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); 
		driver.manage().deleteCookieNamed("seesionkey");
		//click on any link 
		//login page  - verify login url
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		//Webpage screenshot 
		
		

		/*
		TakesScreenshot tss = (TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		*/
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(src,new File("C:\\Users\\RahPoo\\OneDrive\\Selenium Practice\\Introduction\\src\\TakesScreenshot\\screenshot.png"));
		
	}

}
