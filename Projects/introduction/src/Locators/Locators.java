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
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\GIGIA\\CURSOS\\SELENIUM\\Tools\\drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://staging-na01-petsupermarket.demandware.net/s/PetSupermarket/login/");
		driver.findElement(By.id("login-form-email")).sendKeys("Lina3CE020524@yopmail.com");
		driver.findElement(By.id("login-form-password")).sendKeys("Pet1234!");
		//driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary']")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("registration-form-fname")).sendKeys("Linis");
		driver.findElement(By.xpath("//input[@class='form-control billingLastName']")).sendKeys("test");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("3105110389");
		// Esperar a que el botón sea visible e interactuable
       
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        //WebElement botonLogin = wait.until(ExpectedConditions.elementToBeClickable(By.className("btn-primary")));

        // Puedes intentar usar acciones para hacer clic
        //Actions actions = new Actions(driver);
        //actions.moveToElement(botonLogin).click().perform();

     
	
		}
		
	}
	

