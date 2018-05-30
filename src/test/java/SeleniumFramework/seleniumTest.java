package SeleniumFramework;

import org.testng.annotations.Test;

public class seleniumTest {
	
	@Test(groups = "sampleTest")
	public void sampleTestSelenium(){
		System.out.println("Sample Test - Selenium");
	}
	
	@Test
	public void displaySelenium(){
		System.out.println("Display - Selenium");
	}
	
	@Test(groups = "Reg")
	public void Regression(){
		System.out.println("Regression - Selenium");
	}
	
	@Test(groups = "Smoke")
	public void Smoke(){
		System.out.println("Smoke - Selenium");
	}

}
