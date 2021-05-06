package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Tests extends BaseClass {

	/*
	 * Feature: testAppLoginAndSeeDetailAccout()
	 * Given: Application is installed and launched
	 * And:   User is on the Credential Page
	 * When:  User click "I´m customer"
	 * Then:  User see input DNI,NIE, Passport
	 * And:   User click input"
	 * Then:  User Type the dni
	 * And:   User click "Continue"
	 * Then:  User see Password view
	 * And:   User click input"
	 * Then:  User Type the password
	 * And:   User click "login"
	 * Then:  User see dashboard
	 * And:   User click and account
	 * Then:  User see details of account
	 */

	@Test
	public void testAppLoginAndSeeDetailAccout() throws Exception {
		// set timeout for driver actions (similar to step timeout)
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
		By by;
		@SuppressWarnings("unused")
		boolean booleanResult;

		// 1. Click 'I´m customer1'
		GeneratedUtils.sleep(500);
		by = By.xpath("//android.widget.Button[@text = 'I´m customer']");
		driver.findElement(by).click();

		// 2. Click 'DNI, NIE, passport'
		GeneratedUtils.sleep(500);
		by = By.xpath("//android.view.View[@text = 'DNI, NIE, passport']");
		driver.findElement(by).click();

		// 3. Click 'ANDROID.WIDGET.EDITTEXT'
		GeneratedUtils.sleep(500);
		by = By.xpath("//android.widget.EditText");
		driver.findElement(by).click();

		// 4. Type '099888771' in 'ANDROID.WIDGET.EDITTEXT'
		GeneratedUtils.sleep(500);
		by = By.xpath("//android.widget.EditText");
		driver.findElement(by).sendKeys("099888771");

		// 5. Click 'Continue'
		GeneratedUtils.sleep(500);
		by = By.xpath("//android.widget.Button[@text = 'Continue']");
		driver.findElement(by).click();

		// 6. Click 'Password'
		GeneratedUtils.sleep(500);
		by = By.xpath("//android.view.View[@text = 'Password']");
		driver.findElement(by).click();

		// 7. Click '1'
		GeneratedUtils.sleep(500);
		by = By.xpath("//android.widget.Button[@text = '1']");
		driver.findElement(by).click();

		// 8. Click '1'
		GeneratedUtils.sleep(500);
		by = By.xpath("//android.widget.Button[@text = '1']");
		driver.findElement(by).click();

		// 9. Click '1'
		GeneratedUtils.sleep(500);
		by = By.xpath("//android.widget.Button[@text = '1']");
		driver.findElement(by).click();

		// 10. Click '1'
		GeneratedUtils.sleep(500);
		by = By.xpath("//android.widget.Button[@text = '1']");
		driver.findElement(by).click();

		// 11. Click 'Login'
		GeneratedUtils.sleep(500);
		by = By.xpath("//android.widget.Button[@text = 'Login']");
		driver.findElement(by).click();

	    // 1. Click 'ANDROID.VIEW.VIEW3'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//android.view.View[4]/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[1]");
	    driver.findElement(by).click();

	}



}
