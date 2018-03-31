package goplayServer;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;


public class SearchExplore {
	public static void main(String[] args) throws InterruptedException, IOException {
		Process p = Runtime.getRuntime().exec("appium");

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		//caps.setCapability("udid", "674862d4"); //Give Device ID of your mobile phone
		caps.setCapability("udid", "ZY223HXGCD");
		caps.setCapability("platformName", "Android");
		//caps.setCapability("platformVersion", "5.1.1");
		caps.setCapability("platformVersion", "6.0.1");
		caps.setCapability("appPackage", "com.goplaybook");
		caps.setCapability("appActivity", "com.goplaybook.activities.MainActivity");
		caps.setCapability("noReset", "true");
		
		AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		driver.findElement(By.id("com.goplaybook:id/iv_search")).click();
		driver.scrollTo("TOURNAMENTS");
		
	}

	
}
