package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Homepage extends Basepage {

	public Homepage(WebDriver driver) {
	super(driver);

	}
@FindBy(xpath = "//span[normalize-space()='log in']")
WebElement Lnksigin;
@FindBy(xpath = "//button[contains(text(),'Log in / sign up')]")
WebElement Siginlogin;
@FindBy(xpath = "//input[@placeholder='Enter 10 digit mobile number']")
WebElement Mobilenumber;
@FindBy(xpath = "//button[contains(text(),'GET OTP')]")
WebElement GetOTP;
@FindBy(xpath = "(//input[@type='text'])[4]")
WebElement OTPGiven;
@FindBy(xpath = "//button[contains(text(),'VERIFY')]")
WebElement submit;


public void clicksigin() {
	Lnksigin.click();
}
	public void Siginlogin()
	{
	Siginlogin.click();
}
	public void Mobilenumber()
	{
		Mobilenumber.sendKeys("5509811133");
	}
	public void GetOTP()
	{
		GetOTP.click();
	}
	public void OTPGiven()
	{
		OTPGiven.sendKeys("123456");
	}
	public void Submitt()
	{
		submit.click();
	}
	
}
		
	
