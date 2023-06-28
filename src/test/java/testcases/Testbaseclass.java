package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbaseclass {
public WebDriver driver;
@BeforeClass
void setup()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://peterengland.abfrl.in/");
driver.manage().window().maximize();

}
@AfterClass
void setdown() throws InterruptedException
{
	Thread.sleep(10000);
	driver.quit();
	
}

}
