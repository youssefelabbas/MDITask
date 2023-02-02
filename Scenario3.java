package ui2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario3 {
    public static void main(String[] args) {
    	   WebDriverManager.chromedriver().setup();
    	  	ChromeDriver driver = new ChromeDriver();

       
        driver.get("https://www.amazon.eg/");

        driver.findElement(By.cssSelector("#nav-link-accountList")).click();
     // Go back to the previous page
        driver.navigate().to("https://www.amazon.eg/");
        
       

        // Select "Your orders"
        //driver.findElement(By.xpath("//*[@id=\"nav_prefetch_yourorders\"]/span")).click();

        driver.findElement(By.xpath("//*[@id=\"nav_prefetch_yourorders\"]/span")).click();
		/*
		 * if(driver.getCurrentUrl().contains("sign-in")) {
		 * System.out.println("User can't see orders when not signed in"); } else {
		 * System.out.println("Error: User can see orders when not signed in"); }
		 */
		 

        

		/*
		 * driver.findElement(By.xpath("//div[@id='nav-flyout-ya-address-book']/a")).
		 * click();
		 * 
		 * if (driver.getCurrentUrl().contains("sign-in")) {
		 * System.out.println("User can't see addresses when not signed in"); } else {
		 * System.out.println("Error: User can see addresses when not signed in"); }
		 * 
		 * driver.navigate().to("https://www.amazon.eg/");
		 * driver.findElement(By.xpath("//div[@id='nav-flyout-ya-wishlist']/a")).click()
		 * ;
		 * 
		 * if (driver.getTitle().contains("Amazon Wish List")) {
		 * System.out.println("User can see the Your Lists screen"); } else {
		 * System.out.println("Error: User can't see the Your Lists screen"); }
		 * 
		 * driver.close();
		 */
    }
}