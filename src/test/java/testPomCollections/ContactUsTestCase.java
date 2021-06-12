package testPomCollections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pomCollections.ContactUsPom;

public class ContactUsTestCase
{
	WebDriver driver;
	@BeforeClass
	public void EnvironSetUp()
	{
		System.setProperty("webdriver.chrome.driver", "E://mydiskB//jar//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.credihealth.com/contact-us");
	}
	@Test
	public void contactUsRequest()
	{
		ContactUsPom cup=new ContactUsPom(driver);
		cup.setUserName("Amit Kumar");
		cup.setmobile("7079217757");
		cup.setemail("amit.kumar@credihealth.com");
		cup.setMessage("contact us query");
		//cup.clickOnSubmit();
	}
}
