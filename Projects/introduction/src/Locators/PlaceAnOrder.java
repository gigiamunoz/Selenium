package Locators;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PlaceAnOrder {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\GIGIA\\CURSOS\\SELENIUM\\Tools\\drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://staging-na01-petsupermarket.demandware.net/s/PetSupermarket/home/");
		WebElement option = driver.findElement(By.linkText("Dog")); 
		
		Actions actions = new Actions(driver);
		actions.moveToElement(option).build().perform(); 
		
		driver.findElement(By.linkText("Dry Food")).click();
		driver.findElement(By.xpath("//div[@class='col-md-4 col-sm-6 plp-item'][2]/a[2]")).click();
		//driver.findElement(By.xpath("//div[@class='col-md-4 col-sm-6 plp-item'][2]/div/div/div/a[2]")).click(); //Quick view
		
		driver.findElement(By.xpath("//div[@class=\"d-flex flex-column\"][3]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@id='onetimepurchase']")).click();
		Thread.sleep(8000);
		driver.findElement(By.cssSelector(".add-to-cart.btn.btn-primary.btn-block")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block checkout-btn']")).click();
		driver.findElement(By.xpath("//input[@id='email-guest']")).sendKeys("Lina3CE020524@yopmail.com");
		
		driver.findElement(By.xpath("//button[@value=\"submit-customer\"]")).click();

		//--------------SHIPPING FORM---------------
		Thread.sleep(4000);
		int zip = 33322;
		long cel = 3105110389L;
		driver.findElement(By.xpath("//input[@id='shippingZipCodedefault']")).sendKeys(String.valueOf(zip));
		driver.findElement(By.xpath("//input[@id='shippingPhoneNumberdefault']")).sendKeys(String.valueOf(cel));
		driver.findElement(By.id("shippingFirstNamedefault")).sendKeys("Lina");
		driver.findElement(By.id("shippingLastNamedefault")).sendKeys("Munoz");
		driver.findElement(By.id("shippingAddressOnedefault")).sendKeys("2696 North University Drive");
		
		//State dropdown
		Select state = new Select(driver.findElement(By.id("shippingStatedefault")));
		state.selectByValue("FL");
		
		driver.findElement(By.id("shippingAddressCitydefault")).sendKeys("Sunrise");

		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@name='check-address']")).click();

		//---------------PAYMENT---------
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//input[@id='cardOwner']")).sendKeys("Lina test");
		
		
		Select exp_month = new Select(driver.findElement(By.xpath("//select[@id='expirationMonth']")));
		exp_month.selectByValue("6");
		
		Select exp_year = new Select(driver.findElement(By.xpath("//select[@id='expirationYear']")));
		exp_year.selectByValue("2028");
		
		int code = 999; 
		driver.findElement(By.xpath("input[@id='securityCode']")).sendKeys(String.valueOf(code));
		
		Thread.sleep(6000);
		
		long cc = 5454545454545454L;
		driver.findElement(By.xpath("//input[@class='form-control cardNumber']")).sendKeys(String.valueOf(cc));
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("button[@value='submit-payment']")).click();

	}

}
