package testClasses;

import org.testng.annotations.*;

import pageFactoryClasses.GoogleHome;
import testBase.TestBase;

public class Test01 extends TestBase{

	GoogleHome gh;
	
	public Test01(){
		super();
		gh = new GoogleHome(driver);	
	}
	
//	@BeforeMethod
//	public void setUp(){
//		initialization();
//		gh = new GoogleHome();	
//	}
	
	@Test
	public void googleSearch() {
		gh.clearSearchInput();
		gh.enterSearchValue("Tasty Food");
		gh.clickSearchBtn();
	}

	

	
}
