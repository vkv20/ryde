package com.ryde.project;

import java.net.URL;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class TestRyde {


	//WebDriver driver;
			static AppiumDriver driver;
			//AndroidDriver driver;
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
					
				try{
				openRyder();
			} catch(Exception exp) {
				System.out.println(exp.getCause());
				System.out.println(exp.getMessage());
				exp.printStackTrace();
				
			}

			}	
			
			public static void openRyder() throws Exception {
				
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setCapability("deviceName", "emulator-5554");
				cap.setCapability("udid", "EMULATOR33X1X23X0");
				cap.setCapability("platformName", "Android");
				cap.setCapability("platformVersion", "14");
				cap.setCapability("appPackage", "com.rydesharing.ryde");
				cap.setCapability("appActivity", "com.sts.ryde.ui.SplashActivity");
				
				@SuppressWarnings("deprecation")
				URL url = new URL("http://127.0.0.1:4723/wd/hub");
				driver = new (url, cap);
				
				System.out.println("Application Started..");
				
			}	
				public void testCal() throws Exception {
				
				driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.rydesharing.ryde:id/btn_login_mobile\"]")).click();
				driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.rydesharing.ryde:id/tv_continue_email\"]")).click();
				driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.rydesharing.ryde:id/et_email\"]")).sendKeys("techqa@mailinator.com");
				driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.rydesharing.ryde:id/btn_get_otp\"]")).click();
				
			}


		    public void teardown(){
		        //close the app
		        driver.quit();
		    }
	
		
	}

