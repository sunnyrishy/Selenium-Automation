Task : Automate facebook application using selenium web driver.


Java - Selenium Code : 

package com.Example;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Testing {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver",

"./Resources/chromedriver.exe");

ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
WebDriver driver = new ChromeDriver(options);
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();

Thread.sleep(3000);
highlight(driver, driver.findElement(By.id("email")));
Thread.sleep(1000);
highlight(driver, driver.findElement(By.id("passContainer")));

Thread.sleep(1000);
highlight(driver, driver.findElement(By.xpath("//a[contains(text(),'Forgotten

password?')]")));

Thread.sleep(1000);
highlight(driver, driver.findElement(By.name("login")));
Thread.sleep(1000);
highlight(driver, driver.findElement(By.id("reg_pages_msg")));
Thread.sleep(1000);
}

public static void highlight(WebDriver driver, WebElement element) {      // used to highlight the selected box/area
JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
jsExecutor.executeScript("arguments[0].setAttribute('style',

'background: yellow; border: 2px solid red;');", element);
}
}

