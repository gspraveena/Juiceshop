package juiceshop;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 //import org.openqa.selenium.WebElement;
 import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class foodorder {

	WebDriver driver = new FirefoxDriver();
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	Actions action=new Actions(driver);
	String URL = "https://juice-shop.herokuapp.com/#/login";

//	Actions action=new Actions(driver);

	By dismissButton = By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-welcome-banner/div/div[2]/button[2]");

	By emailid = By.id("emailControl");
	By passwordd = By.id("passwordControl");
	By reppassword = By.id("repeatPasswordControl");

	By secuQues = By.xpath(
			"/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-register/div/mat-card/div[2]/div[1]/mat-form-field[1]/div/div[1]/div[3]/mat-select/div/div[1]/span");
	By question = By.id("mat-option-0");

	By answer = By.id("securityAnswerControl");
	By register = By.id("registerButton");
//////
	By accountBut = By.id("navbarButton");
////////    By accLogBut=By.id("navbarLoginButton");
	By loginid = By.id("email");
	By logPassword = By.id("password");

	By login = By.id("loginButton");

	By applejuice = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[2]/button");
	By dismiss1 = By.xpath("//body/div[1]/div/a");

	By shopMug = By.xpath("//mat-grid-tile[9]/div/mat-card/div[2]/button");
	By gotoCart = By.xpath("//mat-sidenav-content/app-navbar/mat-toolbar/mat-toolbar-row/button[4]");
	By incappjiuceQuan = By.xpath(
			"//mat-sidenav-content/app-basket/mat-card/app-purchase-basket/mat-table/mat-row[1]/mat-cell[3]/button[2]");
	By incmugQuant = By.xpath(
			"//mat-sidenav-content/app-basket/mat-card/app-purchase-basket/mat-table/mat-row[2]/mat-cell[3]/button[2]");
	By checkout = By.id("checkoutButton");

	By newAddress = By.xpath("//mat-sidenav-content/app-address-select/div/app-address/mat-card/div/button");
	By country = By.id("mat-input-3");
	By name = By.id("mat-input-4");
	By mobileNum = By.id("mat-input-5");
	By zipCode = By.id("mat-input-6");
	By addressBut = By.id("address");
	By city = By.id("mat-input-8");
	By state = By.id("mat-input-9");
	By submit = By.xpath("//*[@id=\"submitButton\"]");
//			xpath("//body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-address-create/div/mat-card/div[2]/button[2]");
			//div/button[@id='submitButton'])");
		//app-address-create/div/mat-card/div[2]/button[2]");

	By addressclick = By.id("mat-radio-41");
	By continueadd = By.xpath("//app-address-select/div/app-address/mat-card/button/span/span");
	By deliverySpeed = By.id("mat-radio-43");
	By continueadd1 = By.xpath("//app-delivery-method/mat-card/div[4]/button[2]");
	By addnewcard = By.xpath("//app-payment-method/div/div/mat-expansion-panel/mat-expansion-panel-header/span[2]");

	By nameinCard = By.id("mat-input-10");
	By cardNumber = By.id("mat-input-11");
	By expirmonclick = By.id("mat-input-12");
	By expireMonth = By.id("//mat-form-field[3]/div/div[1]/div[3]/select/option[4]");
	By expiryrclick = By.id("mat-input-13");
	By expireyear = By.id("//mat-form-field[4]/div/div[1]/div[3]/select/option[1]");
	By submitCard = By.id("//app-payment-method/div/div[2]/mat-expansion-panel/div/div/button");

	By addcoupon = By.xpath("//app-payment/mat-card/div/mat-expansion-panel[1]/mat-expansion-panel-header/span[2]");
	By coupon = By.id("coupon");

	By clickcard = By.id("mat-radio-46-input");
	By continuepay = By.xpath("//app-payment/mat-card/div/div[2]/button[2]");

	By placeorder = By.id("checkoutButton");

	By ordersnpayment = By.xpath("/html/body/div[3]/div[2]/div/div/div/button[2]/span");
	By orderHistory = By.xpath("/html/body/div[3]/div[3]/div/div/div/button[1]");
	By printOrder = By.xpath("//app-order-history/mat-card/div/div/div[2]/div/div/div[1]/div[6]/button");
	By trackOrder = By.xpath("//app-order-history/mat-card/div/div/div[2]/div/div/div[1]/div[5]/button");

	By logOut = By.id("navbarLogooutButton");

	@Test(priority = 1)
	public void webpage1() throws InterruptedException {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(URL);
		Thread.sleep(500);

		// Please login to the website and Add one or two items to basket (from eachpage) –scroll, navigate and select product

		driver.findElement(dismissButton).click();
		driver.findElement(dismiss1).click();

		driver.findElement(emailid).sendKeys("kooe195@gmail.com");
		driver.findElement(passwordd).sendKeys("asd123");
		driver.findElement(reppassword).sendKeys("asd123");

		driver.findElement(secuQues).click();
//		Thread.sleep(500);
		driver.findElement(question).click();
		driver.findElement(answer).sendKeys("spencer");
//		Thread.sleep(500);

////		driver.findElement(accLogBut).click();
		
		 WebElement register= driver.findElement(By.id("registerButton"));
	 
		action.moveToElement(register);
		action.click();
//		driver.findElement(register).click();
		Thread.sleep(500);

		driver.findElement(loginid).sendKeys("kooe195@gmail.com");

		driver.findElement(logPassword).sendKeys("asd123");
		driver.findElement(login).click();
		// driver.findElement(newcusLink).click();

		Thread.sleep(500);
		
		
		driver.findElement(applejuice).click();

// 	    jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		jse.executeScript("window.scrollBy(0,2000)");

// 	    driver.findElement(gotoNext).click();
// 	    driver.navigate().forward();

		driver.findElement(By.cssSelector("[aria-label='Next page']")).click();
		driver.findElement(shopMug).click();
		
//		
// 		  driver.findElement(By.cssSelector("[aria-label='Previous page']")).click();

		// • Go to your basket and increase the quantity of all items by 2

		jse.executeScript("window.scrollBy(0,-2000)");
		Thread.sleep(1000);

		driver.findElement(gotoCart).click();
		driver.findElement(incappjiuceQuan).click();
		driver.findElement(incmugQuant).click();

		// • Press checkout and add a new address (for all inputs generate random values
		// using code and don’t hard code)

		driver.findElement(checkout).click();
		driver.findElement(newAddress).click();
		driver.findElement(country).sendKeys("united states");
		driver.findElement(name).sendKeys("gp");
		driver.findElement(mobileNum).sendKeys("2387652736");
		driver.findElement(zipCode).sendKeys("95129");
		jse.executeScript("0, 2000");

		Thread.sleep(500);
		driver.findElement(addressBut).sendKeys("park keily");
		driver.findElement(city).sendKeys("san jose");
		driver.findElement(state).sendKeys("ca");
//		Thread.sleep(1000);
//		jse.executeScript("0, 2000");
// 	    Thread.sleep(1000);

//		WebElement wait= new WebDriverWait(driver,  Duration.ofSeconds(10)).until(ExpectedConditions. elementToBeClickable(driver.findElement(By.xpath("//div/button[@id='submitButton']"))));
//	        wait.click();
//	        
			driver.findElement(submit).click();
	        
	        
 				action.moveToElement((WebElement)submit).click().perform();
			 
			
 			    //action.moveToElement(checkout).click().perform();

		// • Select the address and any delivery speed

		driver.findElement(addressclick).click();
		driver.findElement(continueadd).click();
		driver.findElement(deliverySpeed).click();
		driver.findElement(continueadd1).click();
		Thread.sleep(1000);

		// • Add a new card, try to add a fake coupon (10 digits) and verify error message

		driver.findElement(addnewcard).click();

		driver.findElement(nameinCard).sendKeys("gp");
		driver.findElement(cardNumber).sendKeys("1234567891234567");
		driver.findElement(expirmonclick).click();
		driver.findElement(expireMonth).click();
		Thread.sleep(1000);

		driver.findElement(expiryrclick).click();
		driver.findElement(expireyear).click();
		driver.findElement(submitCard).click();
		driver.findElement(addcoupon).click();
		driver.findElement(coupon).sendKeys("8765784878");
		Thread.sleep(1000);

		// . Select card, review and place the order.

		driver.findElement(clickcard).click();
		driver.findElement(continuepay).click();
		driver.findElement(placeorder).click();
		Thread.sleep(1000);

		// • Verifying Account, order history -> print order, track order

		driver.findElement(accountBut).click();

		driver.findElement(ordersnpayment).click();
		driver.findElement(orderHistory).click();
		driver.findElement(printOrder).click();
		driver.findElement(trackOrder).click();
		Thread.sleep(1000);

		// • Then logout from the application

		driver.findElement(accountBut).click();
		driver.findElement(logOut).click();

	}

}
 