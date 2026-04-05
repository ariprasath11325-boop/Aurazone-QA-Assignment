package msedgedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Aurazone_Website {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://test.aurazone.shop/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Shop Now')]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//img[@alt='Retro Colorblock']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[text()='Email & Password']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath(" //input[@type='email']")).sendKeys("suriya123@gmail.com");
        Thread.sleep(2000);
        
        driver.quit();

	}

}
