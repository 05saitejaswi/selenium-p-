package projectnm;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicMethods {

	public static String browser = "edge";// external configuration XLS,CSV
	public static WebDriver driver;
	
	public static void main(String[] args) {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup(); // creating object
			driver = new ChromeDriver();

		} else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		//methods in webdrivers
		/*
		 * 1.navigate to url 2.maximize the tab 3.get current url 4.title of url 5.all
		 * html pagesource printedin output 6.navigated to google 7.closed
		 */
		driver.get("https://www.saucedemo.com/");// till here we have open browser and launch that url
		driver.manage().window().maximize();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		
		//driver.navigate().to("http://google.com");
		
		
		
		//methods in webdrivers few more methods
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();
		
		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='inventory_list']/div")); //forxpath weneed ctrl+f customise the xpath
		System.out.println(webelements);
		
		driver.navigate().to("https://www.sugarcrm.com/au/solutions/");
		String windowhandle =driver.getWindowHandle();
		System.out.println(windowhandle);
		//click on request demo
		driver.findElement(By.xpath("//*[@id=\"main\"]/section[4]/div/div/div[1]/a")).click();
        Set<String> windowhandles= driver.getWindowHandles();
		System.out.println(windowhandles);
		
		driver.quit();
		
		
        
	}

}

********************************************************************************************************

//Demoautomation.javva
package projectnm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		driver.close();
	}

}


*******************************************************************************************************


//basics set up before the mavine projects setup
package projectnm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintest {
	public static String browser = "edge";// external configuration XLS,CSV
	public static WebDriver driver;// variabales of same name cant be ,u cant create the objects of
									// interface(webdriver is interface) , you can only create the objects for
									// class(chrome,firefoxetc.)

	public static void main(String[] args) {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup(); // creating object
			driver = new ChromeDriver();

		} else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		//driver.get("https://www.saucedemo.com/");// till here we have open browser and launch that url
		// driver.findElement(By.id("user-name")).sendKeys("standard_user");//invoking
		// the driver
		// driver.findElement(By.className("form_input")).sendKeys("standard_user");//invoking
		// the driver
		// driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");//invoking the driver
//		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");// invoking the driver
//		driver.findElement(By.tagName("input")).sendKeys("standard_user");// invoking the driver
//
//		driver.findElement(By.name("password")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();
//		driver.close();
driver.get("https://www.selenium.dev/documentation/en/getting_started/");
driver.findElement(By.linkText("Quick tour")).click();
	}

}


*****************************************************************************************************

//printalllinks
package projectnm;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		//one specific link
		WebElement alltags =driver.findElement(By.tagName("a"));
		System.out.println("Total tags are: "+alltags.getSize());
		
		//all links 
//		for(int i=0;i<alltags.size();i++)
//		{
//			
//			System.out.println("Links on page are "+alltags.get(i).getAttribute("href"));
//			System.out.println("Links on page "+alltags.get(i).getTest());
//			
//	    }

	}
}


*********************************************************************************************************

//relativeLocators
package projectnm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocaters {

	public static String browser = "edge";// external configuration XLS,CSV
	public static WebDriver driver;
	
	public static void main(String[] args) {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup(); // creating object
			driver = new ChromeDriver();

		} else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.get("https://www.saucedemo.com/");// till here we have open browser and launch that url
		WebElement password= driver.findElement(By.id("password"));
        driver.findElement(with(By.tagName("input")).below(password)).click();
        
        
	}

}
***************************************************************************************************
//selectDropDrown

package projectnm;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		//driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.get("https:www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		WebElement ddown= driver.findElement(By.name("employees_c"));
		Select select= new Select(ddown);
		WebElement firstOption = select.getFirstSelectedOption();
		System.out.println(firstOption.getText());
		
		select.selectByValue("level1");
		
		select.selectByVisibleText("51 - 100 employees");
		
		select.selectByIndex(5); Thread.sleep(2000);

		//multiselected ddown list
//		WebElement ddown = driver.findElement(By.id("multi-select"));
//		Select select = new Select(ddown);
//		select.selectByValue("California");
//		select.selectByIndex(5);// call multiselect list
//		Thread.sleep(2000);
//		
//		List<WebElement> allItems = select.getAllSelectedOptions();
//		System.out.println(allItems.size());
//		select.deselectAll();
//		select.selectByValue("California");
//		select.selectByIndex(5);
//		
//		select.deselectByIndex(5);
//		List<WebElement> allItems1 = select.getAllSelectedOptions();
//		System.out.println(allItems1.size());
//		
//		
		
	}

}


*************************************************************************************************

package projectnm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class webelemets {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Testing");
		driver.findElement(By.name("firstname")).clear();
		System.out.println(driver.findElement(By.name("firstname")).getAttribute("class"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getCssValue("text-transform"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getSize());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getLocation());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getTagName());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/div[3]/div/div/div[1]/p")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isSelected());
		



		
		
	}

}



***************************************************************************************************************
//pom.xml


<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>organizationnm</groupId>
	<artifactId>projectnm</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<dependencies>
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.0.0-beta-4</version>
		</dependency>

		<dependency>
			<groupId>io.github.bonigarcia</groupId>
			<artifactId>webdrivermanager</artifactId>
			<version>4.4.3</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.testng/testng -->
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>7.4.0</version>
			<scope>test</scope>
		</dependency>
		

	</dependencies>
</project>



********************************************************************************************************
//testng:
package ui1;
//testng.org
import org.testng.annotations.Test;

public class LoginTest1 {

	@Test(priority=1,description="this is login test")
	public void bloginTest()//method
	{
		System.out.println("Login is successfull");
	}
	
	@Test(priority=2,description="this is logout test")
	public void alogoutTest()
	{
		System.out.println("Logout is successfull");
	}
}

*************************************************************************************************************


package script1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class NewTest {
	String driverPath="C:\\Users\\HP\\Desktop\\icons folder\\web\\chromedriver.exe";
 public WebDriver driver;
 
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver",driverPath);
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String websiteurl="http://www.google.com";
		driver.get(websiteurl);
	  
  }
  @Test
  Public void fnInput()
  {
	  WebElement p=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		p.sendKeys("Gmail");
		p.sendKeys(Keys.ENTER);
		WebElement Sitelink=driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']"));
		 Sitelink.click();
  }

}

***********************************************************************************************
package gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\icons folder\\web\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		WebElement p=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		p.sendKeys("Gmail");
		p.sendKeys(Keys.ENTER);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']")).click();
		//String gmail
	//driver.findElement(By.xpath("//a[@class='gb_f']")).click();
	driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
	driver.findElement(By.id("identifierId")).sendKeys("saitejaswi.chakravaram05@gmail.com");
	driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
	//driver.findElement(By.xpath("//div[@id='next']")).cli;
//driver.findElement(By.name("Try again")).click();
//
		
	}

}
*****************************************************************************************************

package org;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logintest1 {
	@BeforeTest
	public void logintoApplication()
	{
		System.out.println("login to application");
	}
	@AfterTest
	public void logouttoapplication()
	{
		System.out.println("logout from application");
	}
	
	
	@BeforeMethod
	public void connecttoDb() {
		System.out.println("db connectected");		
	}
	
	
	@AfterMethod
	public void disconnecfromDb() {
		System.out.println("db disconnectected");	
	}
	
	@Test(priority=1,description="This is login")
	public void alogin() {
		
		System.out.println("tes1");
	}
	
	@Test(priority=2,description="This is logout")
	public void alogout() {
		System.out.println("test2");

	}

}

******************************************************************************************
package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifytitileTest {
 public void TitleTest()
 {
	 String title="Electr"
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.ebay.com/");
	 
 }
}
*********************************************************************************************
package com.example.sample;
import android.R;
//
//public class simple {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;


public class simple extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item);
        tToast("onCreate");
    }

    public void onStart() {
    	super.onStart();
    	tToast("onStart");
    }

    public void onRestart() {
    	super.onRestart();
    	tToast("onRestart");
    }

    public void onResume() {
    	super.onResume();
    	tToast("onResume");
    }

    public void onPause() {
    	super.onPause();
    	tToast("onPause: bye bye!");
    }

    public void onStop() {
    	super.onStop();
    	tToast("onStop.");
    }

    public void onDestroy() {
    	super.onStop();
    	tToast("onDestroy.");
    }

    private void tToast(String s) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, s, duration);
        toast.show();
    }

}


        
***************************************************************************************************
package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gmail {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	   
	      WebElement p=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	      p.sendKeys("Gmail");
		  p.sendKeys(Keys.ENTER);
		  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  WebElement sitelink=driver.findElement(By.xpath(""));
		  
//	      p.submit();
//	      Web
//	      driver.findElement(By.xpath("//h3[@class='tF2Cxc']")).click();
//	      
		//driver.get("https://www.google.com/search?q=gmail&oq=gmail&aqs=chrome..69i57j69i59j69i61j69i65l2.3671j0j7&sourceid=chrome&ie=UTF-8");

//		driver.findElement(By.xpath("//a[@class='gb_f']")).click();
//		driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
//		driver.findElement(By.id("identifierId")).sendKeys("saitejaswi.chakravaram05@gmail.com");
//		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
//  	//driver.findElement(By.name("Try again")).click();
//
//		driver.findElement(By.xpath("//*[@id='next']")).click();
//		driver.findElement(By.name("password")).sendKeys("*******");
//		driver.findElement(By.xpath("//*[@id='passwordNext']")).click();		
}
}

***************************************************************************************************
package pack;


import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multi {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
//		driver.get("https://www.amazon.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
//		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
//		
		String baseUrl="http://demo.guru99.com/test/newtours/";
		String expectedTitle="Welcome:Mercury Tours";
		String actualTitle="";
		driver.get(baseUrl);
		actualTitle=driver.getTitle();
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		driver.close();
	}

}

**********************************************************************************************
package pack;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class sub {

	public static String browser = "chrome";// external configuration XLS,CSV
	public static WebDriver driver;
	
	public static void main(String[] args) {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup(); // creating object
			driver = new ChromeDriver();

		} else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		//methods in webdrivers
		/*
		 * 1.navigate to url 2.maximize the tab 3.get current url 4.title of url 5.all
		 * html pagesource printedin output 6.navigated to google 7.closed
		 */
		driver.get("https://www.saucedemo.com/");// till here we have open browser and launch that url
		driver.manage().window().maximize();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		
		//driver.navigate().to("http://google.com");
		
		
		
		//methods in webdrivers few more methods
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();
		
		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='inventory_list']/div")); //forxpath weneed ctrl+f customise the xpath
		System.out.println(webelements);
		
		driver.navigate().to("https://www.sugarcrm.com/au/solutions/");
		String windowhandle =driver.getWindowHandle();
		System.out.println(windowhandle);
		//click on request demo
		driver.findElement(By.xpath("//*[@id=\"main\"]/section[4]/div/div/div[1]/a")).click();
        Set<String> windowhandles= driver.getWindowHandles();
		System.out.println(windowhandles);
		
		driver.quit();
		
		
        
	}

}

********************************************************************************************



package amazonlogin;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AmazonLogin {	 
	String driverPath="C:\\Users\\HP\\Desktop\\icons folder\\web\\chromedriver.exe";
	 public WebDriver driver;
	 
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver",driverPath);
			 driver=new ChromeDriver();
	  }
	  //url
	  @Test
	  public void gh() {
	driver.manage().window().maximize();
			
			String websiteurl="http://www.google.com";
			driver.get(websiteurl);
			driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();
	  }
	  //site enter
	  @Test
	  public void fnInput()
	  {
		 
	  WebElement p=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
			p.sendKeys("amazon");
		p.sendKeys(Keys.ENTER);
		WebElement Sitelink=driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']"));
		Sitelink.click();
			 
	  }
	  //login
	  @Test
	  public void dev() {
		  driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
			 WebElement a= driver.findElement(By.xpath("//input[@id='ap_email']"));
			 a.sendKeys("saitejaswi.chakravaram05@gmail.com");
			driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
			WebElement b= driver.findElement(By.xpath("//input[@id='ap_password']"));
		 b.sendKeys("Saitejaswi.05");
		 driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	  }
	  
	  @Test
	  public void tearDown() {
		  driver.quit();
		  
	  }
	  

	}















