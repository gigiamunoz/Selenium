import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentTwo {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Lina Test");
	
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("lina.testautmation@yopmail.com");
		
		driver.findElement(By.cssSelector("input[id=\"exampleCheck1\"]")).click();
		
		WebElement gender = driver.findElement(By.xpath("//select[@id=\"exampleFormControlSelect1\"]"));
		Select optionsgender = new Select(gender);
		optionsgender.selectByVisibleText("Female");
		
		
		driver.findElement(By.id("inlineRadio2")).click();
		
		driver.findElement(By.name("bday")).click();
		
		driver.findElement(By.xpath("//input[@value=\"Submit\"]")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]")).getText());
		
		if (driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]")).getText().contains(" The Form has been submitted successfully!.\r\n"
				+ "")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
 
		
		
		
		
		
		

		
	}

}
