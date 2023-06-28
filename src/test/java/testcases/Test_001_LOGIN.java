package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;



import pageObjects.Homepage;

public class Test_001_LOGIN extends Testbaseclass{
	
	@Test
	void TestLogin()
	{
Homepage hp =new Homepage(driver);
hp.clicksigin();
hp.Siginlogin();
hp.Mobilenumber();
hp.GetOTP();
hp.OTPGiven();
hp.Submitt();

{

String ActualTitle = driver.getTitle();
String ExpectedTitle = "Mens Clothing, Accessories & Footwear Online | Online Shopping for Men - Peter England";
Assert.assertEquals(ActualTitle, ExpectedTitle);
System.out.println("Test is paased");
}

	}

}