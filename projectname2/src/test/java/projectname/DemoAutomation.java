package projectname;
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


//email automation
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
		driver.get("http://www.yahoo.com");
		WebElement p=driver.findElement(By.xpath("//input[@class='sbq']"));
		p.sendKeys("Gmail");
		p.sendKeys(Keys.ENTER);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']")).click();
		//String gmail
//		driver.findElement(By.xpath("//a[@class='gb_f']")).click();
		//driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
	//driver.findElement(By.id("identifierId")).sendKeys("saitejaswi.chakravaram05@gmail.com");
	//driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
	//driver.findElement(By.xpath("//div[@id='next']")).cli;
//driver.findElement(By.name("Try again")).click();
//
		
	}

}

