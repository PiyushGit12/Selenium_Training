package testNGListeners;

import org.junit.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test // It will not be excecuted->(enabled = false)
	public void loginByEmail() {

		System.out.println("Login By Email");
		Assert.assertEquals("Testing", "Testing"); // True
	}

	@Test()
	public void loginByName() {

		System.out.println("Login By Name");
		Assert.assertEquals("Testing", "Testing"); // True
	}

	@Test
	public void loginByFacebook() {

		System.out.println("Login By facebook");
		Assert.assertEquals("Testing", "FB"); // False
	}

}