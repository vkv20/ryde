package RydeWeb.SeleniumTest;

import java.awt.Point;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RyderWebsite {



	@SuppressWarnings("deprecation")
	public static void main(String[] args)  {


		//Launch Chrome web browser
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Vijay Vishwakarma\\eclipse-workspace\\Ryde\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get(baseUrl);
		driver.get("https://rydesharing.com");
		


		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
			
		 WebElement element = driver.find_element_by_xpath("//div[@class='elementor-column elementor-col-100 elementor-top-column elementor-element elementor-element-1535567b']//div[@class='elementor-widget-wrap elementor-element-populated e-swiper-container']");

		 
		 org.openqa.selenium.Point location = element.getLocation();
	     System.out.println("X, Y - coordinates : " + location); 
		
		
		//By executing a java script
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer noOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("No. of iframes on the page are " + noOfFrames);
		
	
		//Switch by Index 
		driver.switchTo().frame(0);
		System.out.println("Switched to iframe");
		
		
		//To check Element Present:
			if(driver.findElement(By.xpath("//div[@class='elementor-column elementor-col-100 elementor-top-column elementor-element elementor-element-1535567b']//div[@class='elementor-widget-wrap elementor-element-populated e-swiper-container']"!= null)));{

			System.out.println("Element is Present");

			}

			else{

			System.out.println("Element is Absent");

			}

		//To check Visible:
			if( driver.findElement(By.cssSelector("div[class='swiper-slide swiper-slide-active'] img[alt='Ryde-X-Trust_Ryde-Web-Banner-01']")).isDisplayed()){

			System.out.println("Element is Visible");

			}else{

			System.out.println("Element is InVisible");

			}
		
		
		driver.findElement(By.xpath("//div[@class='swiper-slide swiper-slide-duplicate swiper-slide-active']//img[@alt='RydeSAFE with FWD Ride Cover Free Extension_Website Banner-01']")).click();
		
		//get window handlers as list
		List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
		//switch to new tab
		driver.switchTo().window(browserTabs .get(1));
	
		System.out.println(driver.getTitle());
		
		driver.close();
		driver.switchTo().window(browserTabs.get(0));
		
		driver.findElement(By.xpath("(//i[@class='eicon-close'])[1]")).click();
		
		if(driver.findElement(By.xpath("//div[@class='swiper-slide swiper-slide-active']//img[@alt='Ryde-X-Trust_Ryde-Web-Banner-01']"))!= null){

		System.out.println("Element is Present");

		}else{

		System.out.println("Element is Absent");

		}
		  

		driver.manage().

		driver.switchTo().defaultContent();
		 driver.quit();
		
	}


		
	}


