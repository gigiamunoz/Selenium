package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		WebElement dropdownAutoSugg = driver.findElement(By.xpath("//input[@id='autosuggest']"));
		dropdownAutoSugg.sendKeys("ind");
		
		Thread.sleep(3000);
		
		 List<WebElement> options = driver.findElements(By.xpath("//ul[@class=\'ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all\'][1] //li"));
		
		 for (WebElement option : options) {
			 if (option.getText().equalsIgnoreCase("India")) {
				 option.click();
				 System.out.println(option.getText());
				 break;
			 }
		 }
		
		
	}

}
