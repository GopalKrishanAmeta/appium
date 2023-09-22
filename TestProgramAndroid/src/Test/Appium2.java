package Test;
 
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Appium2 {
	static RemoteWebDriver driver;

	public static void main(String[] args) throws MalformedURLException, ParseException {
		// TODO Auto-generated method stub

		DesiredCapabilities capability = new DesiredCapabilities();

		capability.setCapability("platformName", "Android");
		capability.setCapability("appPackage", "com.cadou");
		capability.setCapability("appActivity", "com.cadou.view.activity.SplashActivity");

		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement selectLanguage = driver.findElement(By.id("com.cadou:id/tv_english"));
		// WebElement selectLanguage =
		// driver.findElement(By.id("com.cadou:id/tv_arabic"));
		selectLanguage.click();

		WebElement skip = driver.findElement(By.id("com.cadou:id/tv_skip"));
		skip.click();

		WebElement mobileNumber = driver.findElement(By.id("com.cadou:id/etMobileEmail"));
		mobileNumber.sendKeys("07071992");

		WebElement password = driver.findElement(By.id("com.cadou:id/et_password"));
		password.sendKeys("123456");

		WebElement login = driver.findElement(By.id("com.cadou:id/tvLogin"));
		login.click();

		WebElement Gift = driver.findElement(By.id("com.cadou:id/navigation_gift"));
		Gift.click();

		WebElement product = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"));
		product.click();

		WebElement addtocart = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView"));
		addtocart.click();

		WebElement clickoncart = driver.findElement(By.id("com.cadou:id/ivCartProduct"));
		clickoncart.click();

		WebElement checkout = driver.findElement(By.id("com.cadou:id/tvCheckout"));
		checkout.click();

		WebElement next1 = driver.findElement(By.id("com.cadou:id/tvNextCheckoutProcess"));
		next1.click();

		WebElement methebyer = driver.findElement(By.id("com.cadou:id/tvBuyerCheckoutProcess"));
		methebyer.click();

		WebElement next2 = driver.findElement(By.id("com.cadou:id/tvNextCheckoutProcess"));
		next2.click();

		boolean walleton = driver.findElement(By.id("com.cadou:id/ivAllSwitchWallet")).isSelected();

// When Wallet Toggle ON
		if (!walleton) {

			float walletAmount = 0;
			float totalAmount = 0;
			String walletAmounttext = driver.findElement(By.id("com.cadou:id/tvWalletAmount")).getText();
			String totalAmountText = driver.findElement(By.id("com.cadou:id/tvTotalAmountCheckoutProcess")).getText();
			Pattern pat = Pattern.compile("[-]?[0-9]*\\.?[0-9]+");
			Matcher m = pat.matcher(walletAmounttext);
			Matcher m1 = pat.matcher(totalAmountText);
			while (m.find() && m1.find()) {
				walletAmount = Float.parseFloat(m.group());
				totalAmount = Float.parseFloat(m1.group());
			}

			System.out.println(walletAmount);
			System.out.println(totalAmount);

			if (walletAmount > totalAmount) {
				WebElement clickonterms = driver.findElement(By.id("com.cadou:id/cbAgreeConditionCheckoutProcess"));
				clickonterms.click();

			}

			else {
				WebElement selectpaymentmethod = driver
						.findElement(By.id("com.cadou:id/spPaymentTypeCheckoutLoginProcess"));
				selectpaymentmethod.click();

				WebElement cod = driver.findElement(By.xpath(
						"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
				cod.click();

				WebElement clickonterms = driver.findElement(By.id("com.cadou:id/cbAgreeConditionCheckoutProcess"));
				clickonterms.click();

			}

// When Wallet Toggle OFF
		} else {
			WebElement selectpaymentmethod = driver
					.findElement(By.id("com.cadou:id/spPaymentTypeCheckoutLoginProcess"));
			selectpaymentmethod.click();

			WebElement cod = driver.findElement(By.xpath(
					"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
			cod.click();

			WebElement clickonterms = driver.findElement(By.id("com.cadou:id/cbAgreeConditionCheckoutProcess"));
			clickonterms.click();
		}

		WebElement done = driver.findElement(By.id("com.cadou:id/tvNextCheckoutProcess"));
		done.click();

	}

}
