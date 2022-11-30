package library_Files;

import java.net.MalformedURLException;
//import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class 
{

	public WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public void initialiseBrowser() throws MalformedURLException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jasminmulla\\Sample1\\Files\\chromedriver.exe");
		
// chrome browser
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://15.207.27.239/");
/*			
//Headless mode
	    WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
    
// Selenium-Docker hub:

//		ChromeOptions opt = new ChromeOptions();
//		WebDriver driver = new RemoteWebDriver(new URL("http://13.126.8.115:4444/"),opt); 
  
	    DesiredCapabilities cap = new DesiredCapabilities ();
	    cap.setCapability("browsername", "chrome");
	    try {
	         driver = new RemoteWebDriver(new URL("http://43.205.98.143:4444/wd/hub"), cap);
	    } catch(MalformedURLException e) {
	    	e.printStackTrace();
	    }
*/	  
	}
}

