 Task : Go to gmail, open the latest mail and compose an email to your friend with valid subject and logout your account.

Java - Selenium Code : 

package com.Example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Email {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver",

"./Resources/chromedriver.exe");

ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
WebDriver driver = new ChromeDriver(options);
driver.get("https://www.gmail.com");
driver.manage().window().maximize();
String username = "420117@student.nitandhra.ac.in";
String password = "password";
String friend_email = "sunnyrishyvardhan@example.com";
String subject = "Test Email";
String body = "Hello, this is a test email sent via Selenium!";
WebElement usernameField = driver.findElement(By.id("identifierId"));
usernameField.sendKeys(username);
WebElement nextButton = driver.findElement(By.id("identifierNext"));
nextButton.click();
Thread.sleep(15000);
WebElement passwordField = driver.findElement(By.name("password"));

passwordField.sendKeys(password);
WebElement signInButton = driver.findElement(By.id("passwordNext"));
signInButton.click();
Thread.sleep(5000);
WebElement latestEmail =
driver.findElement(By.xpath("//div[@class='y6']//span[@class='bog']"));
latestEmail.click();
Thread.sleep(5000);
WebElement composeButton = driver.findElement(By.cssSelector(".T-I-KE"));
composeButton.click();
Thread.sleep(10000);

WebElement toField = driver.findElement(By.xpath("//*[@id=\":su\"]"));
toField.sendKeys(friend_email);
Thread.sleep(8000);
WebElement subjectField = driver.findElement(By.name("subjectbox"));
subjectField.sendKeys(subject);
Thread.sleep(3000);
WebElement bodyField = driver.findElement(By.cssSelector(".editable"));
bodyField.sendKeys(body);
Thread.sleep(3000);
WebElement sendButton = driver.findElement(By.cssSelector(".dC"));
sendButton.click();
Thread.sleep(5000);
WebElement profileButton =
driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div[2]/div[2]/div/a/img"));
profileButton.click();

WebElement signOutButton =
driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/div/div/div[2]/div[3]/span/a/sp
an[2]/div/divbob"));
signOutButton.click();
}
}



Execution :
https://youtu.be/kFf4e9ExzfI
