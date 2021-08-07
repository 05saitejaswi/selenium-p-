package projectname;

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
