package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SelIntroduction{

	public static void main(String[] args) {
		//Step 1: Invoking Browser 
		//Chrome - ChromeDriver -> Methods 
		//Firefox- FirefoxDriver ->Methods 
		//safari SafariDriver --> Methods
		//Los nombres de los metodos se llaman igual para los drivers de cada browser
		
		// chrome.exe --> is the Chrome driver that will invoke the Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\GIGIA\\CURSOS\\SELENIUM\\Tools\\drivers\\chromedriver-win64\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		
		//Firefox 
		//grecko driver
		System.setProperty("webdriver.grecko.driver", "C:\\GIGIA\\CURSOS\\SELENIUM\\Tools\\drivers\\geckodriver-v0.34.0-win-aarch64\\geckidriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//Edge
		System.setProperty("webdriver.grecko.driver", "C:\\GIGIA\\CURSOS\\SELENIUM\\Tools\\drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		
		
		driver.get("https://staging-na01-petsupermarket.demandware.net/s/PetSupermarket/home/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
