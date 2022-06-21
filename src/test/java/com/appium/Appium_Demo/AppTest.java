package com.appium.Appium_Demo;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AppTest {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability("appPackage", "com.monefy.app.lite");
		cap.setCapability("appActivity", "com.monefy.activities.main.MainActivity_");
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"),
				cap);
		// Onboarding screens
		driver.findElement(By.id("com.monefy.app.lite:id/buttonContinue")).click();
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.Button"))
				.click();
		driver.findElement(By.id("com.monefy.app.lite:id/buttonContinue")).click();
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton"))
				.click();

		// Income calculator (Adding 500 with 500 and selecting category)
		driver.findElement(By.id("com.monefy.app.lite:id/income_button_title")).click();
		driver.findElement(By.id("ccom.monefy.app.lite:id/buttonKeyboard5")).click();
		driver.findElement(By.id("com.monefy.app.lite:id/buttonKeyboard0")).click();
		driver.findElement(By.id("com.monefy.app.lite:id/buttonKeyboard0")).click();
		driver.findElement(By.id("com.monefy.app.lite:id/buttonKeyboardPlus")).click();
		driver.findElement(By.id("com.monefy.app.lite:id/income_button_title")).click();
		driver.findElement(By.id("ccom.monefy.app.lite:id/buttonKeyboard5")).click();
		driver.findElement(By.id("com.monefy.app.lite:id/buttonKeyboard0")).click();
		driver.findElement(By.id("com.monefy.app.lite:id/buttonKeyboard0")).click();
		driver.findElement(By.id("com.monefy.app.lite:id/buttonKeyboardEquals")).click();

		driver.findElement(By.id("com.monefy.app.lite:id/keyboard_action_button")).click();
//Choosing Salary Category as income
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ImageView"))
				.click();
//Adding Expense (multiplying 5 with 100 and selecting category)
		driver.findElement(By.id("com.monefy.app.lite:id/expense_button_title")).click();
		driver.findElement(By.id("ccom.monefy.app.lite:id/buttonKeyboard5")).click();
		driver.findElement(By.id("com.monefy.app.lite:id/buttonKeyboardMultiply")).click();
		driver.findElement(By.id("ccom.monefy.app.lite:id/buttonKeyboard1")).click();
		driver.findElement(By.id("ccom.monefy.app.lite:id/buttonKeyboard0")).click();
		driver.findElement(By.id("ccom.monefy.app.lite:id/buttonKeyboard0")).click();
		driver.findElement(By.id("com.monefy.app.lite:id/buttonKeyboardEquals")).click();
		driver.findElement(By.id("com.monefy.app.lite:id/keyboard_action_button")).click();
//Choosing Car Category as expense
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.FrameLayout[2]/android.widget.LinearLayout"))
				.click();

//Check pro functionality from a free user (add new income category)
		driver.findElement(By.id("com.monefy.app.lite:id/income_button_title")).click();
		driver.findElement(By.id("ccom.monefy.app.lite:id/buttonKeyboard5")).click();
		driver.findElement(By.id("com.monefy.app.lite:id/keyboard_action_button")).click();
//clicking on add new category button
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ImageView"))
				.click();

	}
}
