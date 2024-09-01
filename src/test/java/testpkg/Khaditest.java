package testpkg;

import org.testng.annotations.Test;

import pagepkg.Khadipage;

public class Khaditest extends Classbase
{
	@Test
	public void test() 
	{
		Khadipage ob= new Khadipage(driver);
		ob.load();
		ob.loginclick("arjunck000@gmail.com","Khadi123");
		ob.login();
		ob.search();
		ob.searchprodt("soap");
		ob.product();
		ob.cartpge();
		

		
	}

}
