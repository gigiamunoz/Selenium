import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertionsPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://spicejet.com"); //URL in the browser

		//Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		//driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		//Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	
		
		//driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']")).click();
	System.out.println(driver.findElement(By.xpath("//div[contains(text(), 'Select Date')]")).isEnabled());
	driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']")).click();
	System.out.println(driver.findElement(By.xpath("//div[contains(text(), 'Select Date')]")).isEnabled());
	//____________________________________________________________-
	
	//driver.findElement(By.xpath("//div[@data-testid=\"one-way-radio-button\"]")).click();
	//Thread.sleep(3000);
	System.out.println(driver.findElement(By.xpath("//div[contains(text(), 'Select Date')]")).getAttribute("style"));
	if (driver.findElement(By.xpath("//div[contains(text(), 'Select Date')]")).getAttribute("style").contains("1")){
		
		Assert.assertTrue(true);
		System.out.println("I'm here");
	}
	else {
		Assert.assertTrue(false);
	}
	}
	

}
