package Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AppiumClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		DesiredCapabilities dc = new DesiredCapabilities();

//	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

		dc.setCapability("platformName", "Android");

//	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");

//	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
//	dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\krishan.gopal\\Desktop\\Projects\\Cadou\\CadouCustomer_v1_21_03_2023-debug.apk");
//	URL url= new URL("http://127.0.0.1:4723/wd/hub");
		dc.setCapability("appPackage", "com.cadou");
		dc.setCapability("appActivity", "com.cadou.view.activity.SplashActivity");

		// AndroidDriver driver =new AndroidDriver(url,dc);
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	Thread.sleep(3000);
		WebElement selectLanguage = driver.findElement(By.id("com.cadou:id/tv_english"));
		selectLanguage.click();
//	Thread.sleep(5000);
		WebElement skip = driver.findElement(By.id("com.cadou:id/tv_skip"));
		skip.click();
//	Thread.sleep(5000);
		WebElement mobileNumber = driver.findElement(By.id("com.cadou:id/etMobileEmail"));
		mobileNumber.sendKeys("07071992");
//	Thread.sleep(5000);
		WebElement password = driver.findElement(By.id("com.cadou:id/et_password"));
		password.sendKeys("123456");
//	Thread.sleep(5000);
		WebElement login = driver.findElement(By.id("com.cadou:id/tvLogin"));
		login.click();

	}

}
