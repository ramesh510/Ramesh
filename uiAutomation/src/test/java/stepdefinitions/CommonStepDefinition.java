package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import constants.Constants;
import io.cucumber.core.logging.Logger;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.CommonUtils;

public class CommonStepDefinition {
	
	public static WebDriver driver;
	@Before
	public void beforeScenario() {
		
		
		try {
			CommonUtils.loadProperties();
			
			
			if (driver==null) {
				launchbrowser();	
			}
			
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void launchbrowser() {
		try {
			switch ("Constants.browser") {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				
				break;
				
			default:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
