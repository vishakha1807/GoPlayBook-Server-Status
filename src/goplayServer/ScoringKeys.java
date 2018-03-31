package goplayServer;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class ScoringKeys {
		
		@Test()
		public static WebElement zero(WebDriver driver) {
		return driver.findElement(By.id("com.goplaybook:id/tv_zero"));
		}
	
		@Test()
		public static WebElement one(WebDriver driver) {
			return driver.findElement(By.id("com.goplaybook:id/tv_one"));
		}
			
		@Test()
		public static WebElement two(WebDriver driver) {
			return driver.findElement(By.id("com.goplaybook:id/tv_two"));
		}
		
		@Test()
		public static WebElement three(WebDriver driver) {
			return driver.findElement(By.id("com.goplaybook:id/tv_three"));
		}
		
		@Test()
		public static WebElement four(WebDriver driver) {
			return driver.findElement(By.id("com.goplaybook:id/tv_four"));
		}
		
		@Test()
		public static WebElement six(WebDriver driver) {
			return driver.findElement(By.id("com.goplaybook:id/tv_six"));
		}
		
		@Test()
		public static WebElement wide(WebDriver driver,String run) {
			driver.findElement(By.id("com.goplaybook:id/tv_wd")).click();
			driver.findElement(By.id("com.goplaybook:id/et_run")).sendKeys(run);
			return driver.findElement(By.id("com.goplaybook:id/tv_done"));
		}
		
		@Test()
		public static WebElement noBallFromBat(WebDriver driver,String run) throws InterruptedException, MalformedURLException {
			driver.findElement(By.id("com.goplaybook:id/tv_nb")).click();
			driver.findElement(By.id("com.goplaybook:id/et_run")).sendKeys(run);
			Thread.sleep(5000);
			try {
			((AppiumDriver) driver).hideKeyboard();
			}catch (Exception e) {
            }
			Thread.sleep(5000);
			return driver.findElement(By.id("com.goplaybook:id/tv_confirm"));
		}
		
		@Test()
		public static WebElement noBallBye(WebDriver driver,String run) {
			driver.findElement(By.id("com.goplaybook:id/tv_nb")).click();
			driver.findElement(By.id("com.goplaybook:id/et_run")).sendKeys(run);
			try {
				((AppiumDriver) driver).hideKeyboard();
				}catch (Exception e) {
	            }
			driver.findElement(By.id("com.goplaybook:id/tv_bye")).click();
			return driver.findElement(By.id("com.goplaybook:id/tv_confirm"));
		}
		
		@Test()
		public static WebElement noBallLegBye(WebDriver driver,String run) {
			driver.findElement(By.id("com.goplaybook:id/tv_nb")).click();
			driver.findElement(By.id("com.goplaybook:id/et_run")).sendKeys(run);
			try {
				((AppiumDriver) driver).hideKeyboard();
				}catch (Exception e) {
	            }
			driver.findElement(By.id("com.goplaybook:id/tv_legbye")).click();
			return driver.findElement(By.id("com.goplaybook:id/tv_confirm"));
		}
		@Test()
		public static WebElement bye(WebDriver driver,String run) {
			driver.findElement(By.id("com.goplaybook:id/tv_bye")).click();
			driver.findElement(By.id("com.goplaybook:id/et_run")).sendKeys(run);
			return driver.findElement(By.id("com.goplaybook:id/tv_done"));
		}
		
		@Test()
		public static WebElement legBye(WebDriver driver,String run) {
			driver.findElement(By.id("com.goplaybook:id/tv_lb")).click();
			driver.findElement(By.id("com.goplaybook:id/et_run")).sendKeys(run);
			return driver.findElement(By.id("com.goplaybook:id/tv_done"));
		}
		
		@Test()
		public static WebElement undo(WebDriver driver) {
			driver.findElement(By.id("com.goplaybook:id/tv_undo")).click();
			return driver.findElement(By.id("android:id/button1"));
		}
		
		@Test()
		public static WebElement fiveSeven(WebDriver driver,String run) {
			driver.findElement(By.id("com.goplaybook:id/tv_fiveSeven")).click();
			driver.findElement(By.id("com.goplaybook:id/et_run")).sendKeys(run);
			return driver.findElement(By.id("com.goplaybook:id/tv_done"));
		}
		
		@Test()
		public static WebElement bowledOut(WebDriver driver,String Batsman) {
			driver.findElement(By.id("com.goplaybook:id/tv_out")).click();
			driver.findElement(By.id("com.goplaybook:id/tv_bowled")).click();
			driver.findElement(By.id("android:id/button1")).click();
			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains("+Batsman+").instance(0))"));
			driver.findElement(By.xpath("//*[@text='"+Batsman+"']")).click();
			return driver.findElement(By.id("com.goplaybook:id/doneLL"));
		}
			
		@Test()
		public static WebElement caughtOut(WebDriver driver,String fielder,String Batsman) throws InterruptedException
				{
					driver.findElement(By.id("com.goplaybook:id/tv_out")).click();
					driver.findElement(By.id("com.goplaybook:id/tv_caught")).click();
					driver.findElement(By.id("com.goplaybook:id/rl_fielder")).click();
					((AppiumDriver) driver).scrollTo("release");
					driver.findElement(By.xpath("//*[@text='"+fielder+"']")).click();
					driver.findElement(By.id("com.goplaybook:id/doneLL")).click();
					driver.findElement(By.id("com.goplaybook:id/tv_confirm")).click();
					driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains("+Batsman+").instance(0))"));
					driver.findElement(By.xpath("//*[@text='"+Batsman+"']")).click();
					driver.findElement(By.id("com.goplaybook:id/doneLL")).click();
					driver.findElement(By.id("com.goplaybook:id/strikePlayerLL")).click();
					return driver.findElement(By.id("com.goplaybook:id/confirmTV"));
				}
			
		@Test()
		public static WebElement caughtBehind(WebDriver driver)
			{
				driver.findElement(By.id("com.goplaybook:id/tv_out")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_caughtBehind")).click();
				driver.findElement(By.id("com.goplaybook:id/rl_fielder")).click();
				driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
				driver.findElement(By.id("com.goplaybook:id/doneLL")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_confirm")).click();
				driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
				driver.findElement(By.id("com.goplaybook:id/doneLL")).click();
				driver.findElement(By.id("com.goplaybook:id/strikePlayerLL")).click();
				return driver.findElement(By.id("com.goplaybook:id/confirmTV"));
			}
			
		@Test()
		public static WebElement caughtBowled(WebDriver driver)
			{
				driver.findElement(By.id("com.goplaybook:id/tv_out")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_caughtBold")).click();
				driver.findElement(By.id("android:id/button1")).click();
				driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
				driver.findElement(By.id("com.goplaybook:id/doneLL")).click();
				driver.findElement(By.id("com.goplaybook:id/strikePlayerLL")).click();
				return driver.findElement(By.id("com.goplaybook:id/confirmTV"));
			}
				
		@Test()
		public static WebElement stumped(WebDriver driver)
			{
				driver.findElement(By.id("com.goplaybook:id/tv_out")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_stumped")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_confirm")).click();
				driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
				return driver.findElement(By.id("com.goplaybook:id/doneLL"));
				
			}
		
		@Test()
		public static WebElement stumpedWide(WebDriver driver)
			{
				driver.findElement(By.id("com.goplaybook:id/tv_out")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_stumped")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_yes")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_confirm")).click();
				driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
				return driver.findElement(By.id("com.goplaybook:id/doneLL"));
			}
			
		@Test()
		public static WebElement runout(WebDriver driver,String run,String fielder,String Batsman)
			{
				driver.findElement(By.id("com.goplaybook:id/tv_out")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_runOut")).click();
				driver.findElement(By.id("com.goplaybook:id/fielderOneRL")).click();
				driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains("+fielder+").instance(0))"));
				driver.findElement(By.id("//*[@text='"+fielder+"']")).click();
				driver.findElement(By.id("com.goplaybook:id/doneLL")).click();
				driver.findElement(By.id("com.goplaybook:id/et_run")).sendKeys(run);
				try {
					((AppiumDriver) driver).hideKeyboard();
					}catch (Exception e) {
		            }
				driver.findElement(By.id("com.goplaybook:id/tv_confirm")).click();
				driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains("+Batsman+").instance(0))"));
				driver.findElement(By.xpath("//*[@text='"+Batsman+"']")).click();
				driver.findElement(By.id("com.goplaybook:id/doneLL")).click();
				driver.findElement(By.id("com.goplaybook:id/strikePlayerLL")).click();
				return driver.findElement(By.id("com.goplaybook:id/confirmTV"));
			}
		@Test()
		public static WebElement lbw(WebDriver driver)
			{
				driver.findElement(By.id("com.goplaybook:id/tv_out")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_lbw")).click();
				driver.findElement(By.id("android:id/button1")).click();
				driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
				return driver.findElement(By.id("com.goplaybook:id/doneLL"));
			}
		@Test()
		public static WebElement retiredHurt(WebDriver driver)
			{
				driver.findElement(By.id("com.goplaybook:id/tv_out")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_retiredHurt")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_confirm")).click();
				driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
				return driver.findElement(By.id("com.goplaybook:id/doneLL"));
			}
		
		@Test()
		public static WebElement retiredHurtCountBall(WebDriver driver)
		{
			driver.findElement(By.id("com.goplaybook:id/tv_out")).click();
			driver.findElement(By.id("com.goplaybook:id/tv_retiredHurt")).click();
			driver.findElement(By.id("com.goplaybook:id/tv_no")).click();
			driver.findElement(By.id("com.goplaybook:id/et_run")).sendKeys("1");
			driver.findElement(By.id("com.goplaybook:id/tv_confirm")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
			return driver.findElement(By.id("com.goplaybook:id/doneLL"));
		}
		@Test()
		public static WebElement retiredOut(WebDriver driver)
			{
				driver.findElement(By.id("com.goplaybook:id/tv_out")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_retiredOut")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_confirm")).click();
				driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
				return driver.findElement(By.id("com.goplaybook:id/doneLL"));
			}
			
		@Test()
		public static WebElement retiredOutCountBall(WebDriver driver)
		{
			driver.findElement(By.id("com.goplaybook:id/tv_out")).click();
			driver.findElement(By.id("com.goplaybook:id/tv_retiredout")).click();
			driver.findElement(By.id("com.goplaybook:id/tv_no")).click();
			driver.findElement(By.id("com.goplaybook:id/et_run")).sendKeys("1");
			driver.findElement(By.id("com.goplaybook:id/tv_confirm")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
			return driver.findElement(By.id("com.goplaybook:id/doneLL"));
		}
		
		@Test()
		public static WebElement actionOut(WebDriver driver)
			{
				driver.findElement(By.id("com.goplaybook:id/tv_out")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_actionOut")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_confirm")).click();
				driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
				return driver.findElement(By.id("com.goplaybook:id/doneLL"));
				
			}
			
		@Test()
		public static WebElement hitTheBallTwice(WebDriver driver)
			{
				driver.findElement(By.id("com.goplaybook:id/tv_out")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_hitBallTwice")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_confirm")).click();
				driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
				return driver.findElement(By.id("com.goplaybook:id/doneLL"));
			}
		
		@Test()
		public static WebElement hitTheBallTwiceNoBall(WebDriver driver)
		{
			driver.findElement(By.id("com.goplaybook:id/tv_out")).click();
			driver.findElement(By.id("com.goplaybook:id/tv_hitBallTwice")).click();
			driver.findElement(By.id("com.goplaybook:id/tv_yes")).click();
			driver.findElement(By.id("com.goplaybook:id/tv_confirm")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
			return driver.findElement(By.id("com.goplaybook:id/doneLL"));
		}
			
		@Test()
		public static WebElement obstructingField(WebDriver driver)
			{
				driver.findElement(By.id("com.goplaybook:id/tv_out")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_obstructingField")).click();
				
				driver.findElement(By.id("com.goplaybook:id/tv_confirm")).click();
				driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
				driver.findElement(By.id("com.goplaybook:id/doneLL")).click();
				driver.findElement(By.id("com.goplaybook:id/strikePlayerLL")).click();
				return driver.findElement(By.id("com.goplaybook:id/confirmTV"));
			}
			
		@Test()
		public static WebElement timedOut(WebDriver driver)
			{
				driver.findElement(By.id("com.goplaybook:id/tv_out")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_timedOut")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_confirm")).click();
				driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
				return driver.findElement(By.id("com.goplaybook:id/doneLL"));
			}
			
		@Test()
		public static WebElement retiredBatsmanPlayAgain(WebDriver driver)
			{
				driver.findElement(By.id("com.goplaybook:id/tv_out")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_retired")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_confirm")).click();
				driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
				return driver.findElement(By.id("com.goplaybook:id/doneLL"));
			}
			
		@Test()
		public static WebElement retiredBatsmanNotPlayAgain(WebDriver driver)
		{
			driver.findElement(By.id("com.goplaybook:id/tv_out")).click();
			driver.findElement(By.id("com.goplaybook:id/tv_retired")).click();
			driver.findElement(By.id("com.goplaybook:id/tv_no")).click();
			driver.findElement(By.id("com.goplaybook:id/tv_confirm")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
			return driver.findElement(By.id("com.goplaybook:id/doneLL"));
		}
		
		@Test()
		public static WebElement hitWicket(WebDriver driver)
			{
				driver.findElement(By.id("com.goplaybook:id/tv_out")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_hitWicket")).click();
				driver.findElement(By.id("com.goplaybook:id/tv_confirm")).click();
				driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
				return driver.findElement(By.id("com.goplaybook:id/doneLL"));							
			
			}
		
		@Test()
		public static WebElement hitWicketWideBall(WebDriver driver)
		{
		driver.findElement(By.id("com.goplaybook:id/tv_out")).click();
		driver.findElement(By.id("com.goplaybook:id/tv_hitWicket")).click();
		driver.findElement(By.id("com.goplaybook:id/tv_yes")).click();
		driver.findElement(By.id("com.goplaybook:id/tv_confirm")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
		return driver.findElement(By.id("com.goplaybook:id/doneLL"));
		}
		
		@Test()
		public static WebElement changeBatsman(WebDriver driver)
		{
		driver.findElement(By.id("com.goplaybook:id/tv_out")).click();
		driver.findElement(By.id("com.goplaybook:id/tv_hitWicket")).click();
		driver.findElement(By.id("com.goplaybook:id/tv_yes")).click();
		driver.findElement(By.id("com.goplaybook:id/tv_confirm")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
		return driver.findElement(By.id("com.goplaybook:id/doneLL"));
		}
		
		
}
