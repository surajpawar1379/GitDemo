package tng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testng2 {
	@Test
	public void test2() {
		System.out.println("2");
	}
@Parameters({"URL","password"})
	@Test
	public void test3(String URL,String pass) {
		System.out.println(URL);
		System.out.println(pass);

	}
	@Test(enabled=false)
	public void test4() {
		System.out.println("4");
	}
}
