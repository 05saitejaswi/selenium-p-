package Amazon;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAmazon {
	String driverPath="C:\\Users\\HP\\Desktop\\icons folder\\web\\chromedriver.exe";
	 public WebDriver driver;
	 
	  @Test
	  public void beforeTest() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver",driverPath);
			 driver=new ChromeDriver();
	  }
	  //url
	  @Test
	  public void gh() throws InterruptedException {
		    String websiteurl="http://www.google.com";
		   driver.get(websiteurl);
		 driver.manage().window().maximize();
		 System.out.println("opened google");

		 ChromeOptions opt = new ChromeOptions();
		 opt.addArguments("--start-maximized");
		 opt.addArguments("--disable-notifications");
		      
		   WebElement p=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		   p.sendKeys("amazon"); 
		  p.sendKeys(Keys.ENTER);
		  Thread.sleep(3000);
		  WebElement Sitelink=driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']"));
		  Sitelink.click();
		  System.out.println("opened amazon");
		    driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		    WebElement a= driver.findElement(By.xpath("//input[@id='ap_email']"));
		    a.sendKeys("*******@gmail.com"); // Send Correct User Name
		    System.out.println("correct emailid");
		   driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		   WebElement b= driver.findElement(By.xpath("//input[@id='ap_password']"));
		   b.sendKeys("*****"); // Send Invalid Password
		   System.out.println("Invalid Password");
		   driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		   Thread.sleep(3000);
		//if(driver.findElement(By.tagName("body")).getText().trim().contains("Your password is incorrect")) // This will be handled when you send incorrect password and valid username
		   String actualUrl="https://www.amazon.in/ap/signin"; 
		   String expectedUrl= driver.getCurrentUrl();
		   if(actualUrl.equalsIgnoreCase(expectedUrl)) 
		   {
			   System.out.println("Login credentials are failed");
		 driver.quit();
		 System.setProperty("webdriver.chrome.driver",driverPath);
		    driver=new ChromeDriver();
		 
		     String websiteurl1="http://www.google.com";
		   driver.get(websiteurl1);
		 driver.manage().window().maximize();

		 ChromeOptions opt1 = new ChromeOptions();
		 opt1.addArguments("--start-maximized");
		 opt1.addArguments("--disable-notifications");
		      
		   WebElement p1=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		   p1.sendKeys("amazon");
		  p1.sendKeys(Keys.ENTER);
		  Thread.sleep(2000);
		  WebElement Sitelink1=driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']"));
		  Sitelink1.click();
		  System.out.println("opened amazon");
		    driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		    WebElement a1= driver.findElement(By.xpath("//input[@id='ap_email']"));
		    a1.sendKeys("******@gmail.com"); // Send Correct User Name
		    System.out.println("Correct EmailId");
		   driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		   WebElement b1= driver.findElement(By.xpath("//input[@id='ap_password']"));
		   b1.sendKeys("*********"); // Send Correct Password
		   System.out.println("Correct Password");
		   driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

		   System.out.println("Logged successfully");
		}
		   }
	  @Test(priority=2,description="2st testcase")
	  public void fun2() throws InterruptedException {
	  	 Thread.sleep(3000);
	  	 WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	  		search.sendKeys("oneplus 9 pro");
	  	search.sendKeys(Keys.ENTER);
	    System.out.println("Searched oneplus 9 pro");
	  }
	  @Test(priority=3,description="3st testcase")
	  public void fun3() throws IOException, InterruptedException {
	  		//throws IOException {
	  		WebElement rating = driver.findElement(By.className("a-icon-alt"));
	  		Reporter.log("searched onepluse 9 pro");
	  		System.out.println(rating.getText());
	  		Actions builder = new Actions(driver);
	  		builder.moveToElement(rating).click().perform();
	  		//1star //h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'] //a[1]//span[1]
	  		Thread.sleep(2000);
	  		String percentageOfRating1 = driver.findElement(By.xpath("//table[@id='histogramTable']//tr[5]/td[3]//a")).getText();
	  		Reporter.log("Reviews that have 1 stars: "+percentageOfRating1);
	  		System.out.println("Reviews that have 1 stars: "+percentageOfRating1);
	  	    //2starts
	  		String percentageOfRating2 = driver.findElement(By.xpath("//table[@id='histogramTable']//tr[4]/td[3]//a")).getText();
	  		Reporter.log("Reviews that have 2 stars: "+percentageOfRating1);
	  		System.out.println("Reviews that have 2 stars: "+percentageOfRating2);
	  		//3stars
	  		String percentageOfRating3 = driver.findElement(By.xpath("//table[@id='histogramTable']//tr[3]/td[3]//a")).getText();
	  	    Reporter.log("Reviews that have 3 stars: "+percentageOfRating3);
	  		System.out.println("Reviews that have 3 stars: "+percentageOfRating3);
	  		//4 starts
	  		String percentageOfRating4 = driver.findElement(By.xpath("//table[@id='histogramTable']//tr[2]/td[3]//a")).getText();
	  	    Reporter.log("Reviews that have 4 stars: "+percentageOfRating4);
	  		System.out.println("Reviews that have 4 stars: "+percentageOfRating4);
	  		
	  		//% of reviews have 5 stars
	  		String percentageOfRating = driver.findElement(By.xpath("//table[@id='histogramTable']//tr[1]/td[3]//a")).getText();
	  		Reporter.log("Reviews that have 5 stars: "+percentageOfRating);
	  		System.out.println("Reviews that have 5 stars: "+percentageOfRating);
	  		driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none']/h2/a)[1]")).click();

	  		Set<String> winHandles = driver.getWindowHandles();
	  		List<String> winList = new ArrayList<String>(winHandles);
	  		driver.switchTo().window(winList.get(1));
	  		Thread.sleep(2000);
	  		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  		File des = new File("./snap/amazon.png");
	  		FileUtils.copyFile(src, des);
	  		System.out.println("Took screenshot");
	  		String b= driver.findElement(By.xpath("//span[@id='priceblock_dealprice']")).getText();
	  		System.out.println("the cost of the mobile is: "+ b);	  		
	  	}
	  @AfterClass
		public void close() {
		  System.out.println("cloased window");
			driver.quit();
			
		}
}


******************************************************************************************************************************************************************
package Amazon; 
 
import java.io.File; 
import java.io.IOException; 
import java.util.ArrayList; 
import java.util.List; 
import java.util.Set; 
 
import org.apache.commons.io.FileUtils; 
import org.openqa.selenium.By; 
import org.openqa.selenium.Keys; 
import org.openqa.selenium.OutputType; 
import org.openqa.selenium.TakesScreenshot; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.chrome.ChromeOptions; 
import org.openqa.selenium.interactions.Actions; 
import org.testng.Reporter; 
import org.testng.annotations.AfterClass; 
import org.testng.annotations.BeforeTest; 
import org.testng.annotations.Test; 
 
import io.github.bonigarcia.wdm.WebDriverManager; 
 
public class LoginAmazon { 
 String driverPath="C:\\Users\\HP\\Desktop\\icons folder\\web\\chromedriver.exe"; 
  public WebDriver driver; 
   
   @Test 
   public void beforeTest() throws InterruptedException { 
    System.setProperty("webdriver.chrome.driver",driverPath); 
    driver=new ChromeDriver(); 
   } 
   //url 
   @Test 
   public void gh() throws InterruptedException  
   { 
      driver.get("https://www.google.com/"); 
//  driver.get("https://www.amazon.com/"); 
   
  driver.findElement(By.xpath(".//form[@action='/search']/descendant::input")).sendKeys("amazon"); 
  driver.findElement(By.xpath(".//form[@action='/search']/descendant::input")).sendKeys(Keys.ENTER); 
   
  driver.findElement(By.xpath(".//h3[normalize-space(text())='Amazon.in']/..")).click(); 
   
  driver.findElement(By.xpath(".//*[@data-nav-role='signin']")).click(); 
   
  driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("**********85@gmail.com");// Pass Correct User Name 
   
  driver.findElement(By.xpath("//input[@id='continue']")).click(); 
   
  driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("*********88"); // Pass Incorrect Password 
   
  driver.findElement(By.xpath("//input[@id='signInSubmit']")).click(); 
   
  if(driver.findElement(By.tagName("body")).getText().trim().contains("Your password is incorrect")) 
  { 
   driver.quit(); 
   
   Thread.sleep(3000); 
    
   WebDriver newdriver = new ChromeDriver(); 
 
   newdriver.get("https://www.google.com/"); 
//   driver.get("https://www.amazon.com/"); 
    
   newdriver.findElement(By.xpath(".//form[@action='/search']/descendant::input")).sendKeys("amazon"); 
   newdriver.findElement(By.xpath(".//form[@action='/search']/descendant::input")).sendKeys(Keys.ENTER); 
    
   newdriver.findElement(By.xpath(".//h3[normalize-space(text())='Amazon.in']/..")).click(); 
    
 
   newdriver.findElement(By.xpath(".//*[@data-nav-role='signin']")).click(); 
   
   newdriver.findElement(By.xpath(".//[@id='ap_email']")).sendKeys("*************@gmail.com"); // Pass Correct User Name 
    
   newdriver.findElement(By.xpath(".//input[@id='continue']")).click(); 
    
   newdriver.findElement(By.xpath(".//[@id='ap_password']")).sendKeys("******85"); // Pass Correct Password 
    
   newdriver.findElement(By.xpath(".//input[@id='signInSubmit']")).click(); 
  } 
 
  } 

   @Test(priority=2,description="2st testcase") 
   public void fun2() throws InterruptedException { 
     Thread.sleep(3000); 
     WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")); 
     search.sendKeys("oneplus 9 pro"); 
    search.sendKeys(Keys.ENTER); 
     System.out.println("Searched oneplus 9 pro"); 
   } 
   @Test(priority=3,description="3st testcase") 
   public void fun3() throws IOException, InterruptedException { 
     //throws IOException { 
     WebElement rating = driver.findElement(By.className("a-icon-alt")); 
     Reporter.log("searched onepluse 9 pro"); 
     System.out.println(rating.getText()); 
     Actions builder = new Actions(driver); 
     builder.moveToElement(rating).click().perform(); 
     //1star //h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'] //a[1]//span[1] 
     Thread.sleep(2000); 
     String percentageOfRating1 = driver.findElement(By.xpath("//table[@id='histogramTable']//tr[5]/td[3]//a")).getText(); 
     Reporter.log("Reviews that have 1 stars: "+percentageOfRating1); 
     System.out.println("Reviews that have 1 stars: "+percentageOfRating1); 
        //2starts 
     String percentageOfRating2 = driver.findElement(By.xpath("//table[@id='histogramTable']//tr[4]/td[3]//a")).getText(); 
     Reporter.log("Reviews that have 2 stars: "+percentageOfRating1); 
     System.out.println("Reviews that have 2 stars: "+percentageOfRating2); 
     //3stars 
     String percentageOfRating3 = driver.findElement(By.xpath("//table[@id='histogramTable']//tr[3]/td[3]//a")).getText(); 
        Reporter.log("Reviews that have 3 stars: "+percentageOfRating3); 
     System.out.println("Reviews that have 3 stars: "+percentageOfRating3); 
     //4 starts 
     String percentageOfRating4 = driver.findElement(By.xpath("//table[@id='histogramTable']//tr[2]/td[3]//a")).getText(); 
        Reporter.log("Reviews that have 4 stars: "+percentageOfRating4); 
     System.out.println("Reviews that have 4 stars: "+percentageOfRating4); 
      
     //% of reviews have 5 stars 
     String percentageOfRating = driver.findElement(By.xpath("//table[@id='histogramTable']//tr[1]/td[3]//a")).getText(); 
     Reporter.log("Reviews that have 5 stars: "+percentageOfRating); 
     System.out.println("Reviews that have 5 stars: "+percentageOfRating); 
     driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none']/h2/a)[1]")).click(); 
 
     Set<String> winHandles = driver.getWindowHandles(); 
     List<String> winList = new ArrayList<String>(winHandles); 
     driver.switchTo().window(winList.get(1)); 
     Thread.sleep(2000); 
     File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); 
     File des = new File("./snap/amazon.png"); 
     FileUtils.copyFile(src, des); 
     System.out.println("Took screenshot"); 
     String b= driver.findElement(By.xpath("//span[@id='priceblock_dealprice']")).getText(); 
     System.out.println("the cost of the mobile is: "+ b);      
    } 
   @AfterClass 
  public void close() { 
    System.out.println("cloased window"); 
   driver.quit(); 
    
  } 
}
