import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AssigmentThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver(); 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value=\"user\"]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		
		Select infobtn = new Select(driver.findElement(By.xpath("//select[@data-style=\"btn-info\"]"))); //Dropdown
		infobtn.selectByValue("consult");
		
		driver.findElement(By.cssSelector("input[id=\"terms\"]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-info.btn-md")).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("button.btn.btn-info")));
		List <WebElement> items = driver.findElements(By.cssSelector("button.btn.btn-info"));
		
		for (WebElement item : items) {
			item.click();
		}
		
		driver.findElement(By.xpath("//a[@class=\"nav-link btn btn-primary\"]")).click();
		
			
		
	
	
		

	}

}
