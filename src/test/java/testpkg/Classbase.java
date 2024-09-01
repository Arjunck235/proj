package testpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Classbase {
	ChromeDriver driver;
	String url="https://www.khadinatural.com/";
	@BeforeTest
	public void load()
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	}



