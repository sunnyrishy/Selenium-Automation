Task :  Go to makemytrip.com and check the tickets from hyderabad to ongole for bus journey on your desired date, select trains, 
        search for trains between tadepalligudem and chennai on specific date, and finally choose flight, search flights from 
        bangalore to delhi on your desired date and finally close the browser.


Java - Selenium Code : 

package com.Example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class MMT {
public static void main(String[] args) throws InterruptedException{
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
WebDriver driver = new ChromeDriver(options);
driver.get("https://www.makemytrip.com");
driver.manage().window().maximize();
//Buses

driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[6]/div/a")).click();

Thread.sleep(2000);
WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"fromCity\"]"));
JavascriptExecutor executor = (JavascriptExecutor) driver;
executor.executeScript("arguments[0].click();", searchBox);
Thread.sleep(2000);
WebElement from =
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/di
v/div/input"));
from.sendKeys("Hyderabad");

Thread.sleep(2000);
WebElement firstElement =
driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]"));
executor.executeScript("arguments[0].click();", firstElement);
WebElement to =
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/d
iv/input"));
executor.executeScript("arguments[0].click();", to);
Thread.sleep(2000);
to.sendKeys("Ongole");
Thread.sleep(2000);
WebElement secondElement =
driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/p/span"));
executor.executeScript("arguments[0].click();", secondElement);
WebElement calender = driver.findElement(By.xpath("//*[@id=\"travelDate\"]"));
executor.executeScript("arguments[0].click();", calender);
Thread.sleep(2000);
WebElement date =
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[3]/div[1]/div/div/d
iv/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[6]"));
executor.executeScript("arguments[0].click();", date);
WebElement search = driver.findElement(By.xpath("//*[@id=\"search_button\"]"));
executor.executeScript("arguments[0].click();", search);
Thread.sleep(10000);
//Trains
WebElement trains =
driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div/nav/ul/li[5]/a/span[1]
"));
executor.executeScript("arguments[0].click();", trains);
WebElement train_from = driver.findElement(By.xpath("//*[@id=\"fromCity\"]"));
train_from.click();
Thread.sleep(3000);
WebElement tfrom =
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[1]/div[1]/div/d
iv/div/input"));
tfrom.sendKeys("Tadepalligudem");

Thread.sleep(3000);
WebElement firstElement1 =
driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]"));
executor.executeScript("arguments[0].click();", firstElement1);
WebElement tto =
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/d
iv/div/input"));
executor.executeScript("arguments[0].click();", tto);
Thread.sleep(2000);
tto.sendKeys("chennai");
Thread.sleep(2000);
WebElement tsecondElement =
driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]"));
executor.executeScript("arguments[0].click();", tsecondElement);
WebElement tcalender = driver.findElement(By.xpath("//*[@id=\"travelDate\"]"));
executor.executeScript("arguments[0].click();", tcalender);
Thread.sleep(2000);
WebElement tdate =
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div/d
iv/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[6]"));
executor.executeScript("arguments[0].click();", tdate);
WebElement tsearch =
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/p/a"));
executor.executeScript("arguments[0].click();", tsearch);
Thread.sleep(10000);
//Flights
WebElement flight =
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/nav/ul/li[1]/a"));
executor.executeScript("arguments[0].click();", flight);
Thread.sleep(3000);
WebElement f_from = driver.findElement(By.xpath("//*[@id=\"fromCity\"]"));
f_from.click();
WebElement ffrom =
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/di
v/div/input"));

ffrom.sendKeys("Bangalore");
Thread.sleep(3000);
WebElement ffirstElement =
driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]"));
executor.executeScript("arguments[0].click();", ffirstElement);
WebElement f_to = driver.findElement(By.xpath("//*[@id=\"toCity\"]"));
f_to.click();
Thread.sleep(2000);
WebElement fto =
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div/di
v/div[1]/input"));
fto.sendKeys("Delhi");
Thread.sleep(2000);
WebElement fsecondElement =
driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]"));
executor.executeScript("arguments[0].click();", fsecondElement);
WebElement depature =
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label"));
executor.executeScript("arguments[0].click();", depature);
Thread.sleep(2000);
WebElement fdate =
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/di
v/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[6]"));
executor.executeScript("arguments[0].click();", fdate);
WebElement fsearch =
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a"));
executor.executeScript("arguments[0].click();", fsearch);
Thread.sleep(10000);
driver.close();
}
}


Execution :
https://youtu.be/wruARY-vsZQ
