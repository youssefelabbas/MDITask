package ui2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario2 {
  public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();
  	ChromeDriver driver = new ChromeDriver();

    driver.get("https://www.amazon.eg/");

    driver.findElement(By.id("nav-hamburger-menu")).click();

    driver.findElement(By.xpath("//*[@id='hmenu-content']/ul[1]/li[17]/a")).click();

    
    try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    driver.findElement(By.xpath("//div[@id = 'slot-15']//a[@aria-controls = 'grid-main-container']//span[contains(text(), 'الجمال')]")).click();

    
    try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    driver.findElement(By.xpath("//*[@id=\"grid-main-container\"]/div[3]/div/div[1]/div/div/div/a[2]/div")).click();

    
    try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    
    driver.findElement(By.xpath("//*[@id=\"octopus-dlp-asin-stream\"]/ul/li[2]/span/div/div[2]/div[1]")).click();

    
    try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    
    driver.findElement(By.xpath("//*[@id=\"quantity\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"quantity\"]")).sendKeys("2");

    try {
  		Thread.sleep(1000);
  	} catch (InterruptedException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	}
    
    
    driver.findElement(By.id("add-to-cart-button")).click();

    driver.findElement(By.id("nav-cart")).click();

    try {
  		Thread.sleep(5000);
  	} catch (InterruptedException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	}
    
    
    // Verify the correct items are in the cart by checking the name, price, quantity, and subtotal
    String itemName = driver.findElement(By.id("sc-active-Cf56deb75-6193-42b6-b788-1428451c0409\\")).getText();
    String itemPrice = driver.findElement(By.xpath("//*[@id=\"sc-active-Cc2ed5468-8a95-4fea-b3d3-7aa78c68a7e5\"]/div[4]/div/div[2]/ul/div/p/span")).getText();
    String itemQuantity = driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).getAttribute("value");
    String itemSubtotal = driver.findElement(By.xpath("//*[@id=\"sc-subtotal-amount-activecart\"]/span")).getText();

    assert itemName.equals("Expected item name");
    assert itemPrice.equals("Expected item price");
    assert itemQuantity.equals("2");
    assert itemSubtotal.equals("Expected item subtotal");
    
    System.out.println(itemName);
    System.out.println(itemPrice);
    System.out.println(itemQuantity);
    System.out.println(itemSubtotal);

    
    driver.quit();
  }
}