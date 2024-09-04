package sauceDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement loginbtn = driver.findElement(By.id("login-button"));
		loginbtn.click();
		
		WebElement backpack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		backpack.click();
		
		WebElement fleecejacket = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
		fleecejacket .click();
		
		WebElement cart = driver.findElement(By.id("shopping_cart_container"));
		cart.click();
		
		WebElement checkout = driver.findElement(By.name("checkout"));
		checkout.click();
		
		WebElement firstname = driver.findElement(By.name("firstName"));
		firstname.sendKeys("Astalakshmi");
		
		WebElement lastname= driver.findElement(By.name("lastName"));
		lastname.sendKeys("Amulraj");
		
		WebElement postalcode= driver.findElement(By.id("postal-code"));
		postalcode.sendKeys("12345");
		
		WebElement continuebtn= driver.findElement(By.id("continue"));
		continuebtn.click();
		
		WebElement finishbtn= driver.findElement(By.id("finish"));
		finishbtn.click();
		
		WebElement message= driver.findElement(By.className("complete-header"));
		System.out.println(message.getText());
		
		WebElement openmenu= driver.findElement(By.className("bm-burger-button"));
		openmenu.click();
	//	Thread.sleep(5);
		WebElement nav= driver.findElement(By.className("bm-menu"));
		WebElement nav1= nav.findElement(By.className("bm-item-list"));
	//	Thread.sleep(3);
		WebElement logout= nav1.findElement(By.id("logout_sidebar_link"));
		logout.click();
		
	}

}
