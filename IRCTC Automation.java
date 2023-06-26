Task : Automate irctc web application using selenium web driver upto search the trains on desired dates.

Java - Selenium Code : 

package com.Example;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
driver.manage().window().maximize();
driver.get("https://www.irctc.co.in/nget/train-search");
Thread.sleep(2000);

driver.findElement(By.cssSelector("input[aria-autocomplete='list']")).sendKeys("TADEPA
LLIGUDEM - TDD");
driver.findElement(By.cssSelector("input[aria-autocomplete='list'][aria-controls='pr_id_2_
list']")).sendKeys("HYDERABAD DECAN - HYB");
WebElement calender_element =
driver.findElement(By.cssSelector("input.ng-tns-c58-10"));
calender_element.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
calender_element.clear();
Thread.sleep(2000);
calender_element.sendKeys("25/03/2023");
WebElement sub = driver.findElement(By.xpath("//button[text()='Search']"));
Thread.sleep(3000);
sub.click();

}
}
