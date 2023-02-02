package ui2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario1 {
  public static void main(String[] args) {
  
	  WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
   

    driver.get("https://www.amazon.eg/");

    
    driver.findElement(By.id("nav-link-accountList")).click();

    driver.findElement(By.id("ap_email")).sendKeys("valid_but_unregistered_email@example.com");

    driver.findElement(By.id("continue")).click();

    String errorMessage = driver.findElement(By.xpath("//div[contains(@class, 'a-alert-error')]")).getText();
    assert errorMessage.contains("We cannot find an account with that email address");

   driver.quit();
  }
}




