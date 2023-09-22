package Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class one_to_Gifting_flow {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities capability = new DesiredCapabilities();

		capability.setCapability("platformName", "Android");
		capability.setCapability("appPackage", "com.cadou");
		capability.setCapability("appActivity", "com.cadou.view.activity.SplashActivity");

		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
		WebElement selectLanguage = driver.findElement(By.id("com.cadou:id/tv_english"));
		
		selectLanguage.click();
		

		WebElement skip = driver.findElement(By.id("com.cadou:id/tv_skip"));
		skip.click();

		WebElement mobileNumber = driver.findElement(By.id("com.cadou:id/etMobileEmail"));
		mobileNumber.sendKeys("07071992");

		WebElement password = driver.findElement(By.id("com.cadou:id/et_password"));
		password.sendKeys("123456");

		WebElement login = driver.findElement(By.id("com.cadou:id/tvLogin"));
		login.click();
		
		WebElement gift_list = driver.findElement(By.id("com.cadou:id/navigation_gift_list"));
		gift_list.click();
		
		WebElement add_gift = driver.findElement(By.id("com.cadou:id/ivAddListGifting"));
		add_gift.click();
		

			WebElement select_occasions = driver.findElement(By.id("com.cadou:id/rvOccasionListSF"));
			List<WebElement> select_occasions_list = select_occasions.findElements(By.id("com.cadou:id/clMain"));
			select_occasions_list.get(0).click();
			WebElement gift_receiver = driver.findElement(By.id("com.cadou:id/ivAddListGiftSF"));
			gift_receiver.click();
			
			WebElement user = driver.findElement(By.id("com.cadou:id/rvUsersListUser"));
			List<WebElement> select_user = user.findElements(By.id("com.cadou:id/clUsersListItem"));
			select_user.get(0).click();
			driver.findElement(By.id("com.cadou:id/tvAddGiftReceiver")).click();

		
		    driver.findElement(By.id("com.cadou:id/tvCreateShareSF")).click();
		    
		    driver.findElement(By.id("com.cadou:id/tvOneToOne")).click();
		    
		    driver.findElement(By.id("com.cadou:id/etRegistryNameSS1")).sendKeys("one to one gift");
		
		    driver.findElement(By.id("com.cadou:id/tvCreateShareSS")).click();
		    
		    driver.findElement(By.id("com.cadou:id/ivOccasionThumbnailST")).click();
		    
		//    driver.switchTo().activeElement();
		    
		    driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
		    
		    driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
		    
		    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")).click();
		    
		    driver.findElement(By.id("com.android.camera2:id/shutter_button")).click();
		
		    driver.findElement(By.id("com.android.camera2:id/done_button")).click();
		    
		    driver.findElement(By.id("com.cadou:id/tvCreateShareST")).click();
		    
		    driver.findElement(By.id("com.cadou:id/ivAddSuggestDetailsGifting")).click();
		    
		             
		 
		    
		    WebElement suggest_gift = driver.findElement(By.id("com.cadou:id/tv_cadou_shop"));
			
		    
			suggest_gift.click();
		    
		    driver.findElement(By.id("com.cadou:id/cvGiftShopProduct")).click();

		    driver.findElement(By.id("com.cadou:id/ivAddProduct")).click();
		    
		    List<WebElement> giftlist = user.findElements(By.id("com.cadou:id/clWishListItem"));
		    
		    giftlist.get(0).click();
		    
		    driver.findElement(By.id("com.cadou:id/text_no_change")).click();
		    
		    WebElement select_gift = driver.findElement(By.id("com.cadou:id/ivSelectedGiftProduct"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", select_gift);
			
			select_gift.click();
		
			driver.findElement(By.id("com.cadou:id/tvEndSendGift")).click();
		
		
		
		
		
	}

}
