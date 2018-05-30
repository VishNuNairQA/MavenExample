package SeleniumFramework;

import org.testng.annotations.Test;

public class appiumTest {

	@Test(groups = "sampleTest")
	public void sampleTestAppium(){
		System.out.println("Sample Test - Appium");
	}
	
	@Test
	public void displayAppium(){
		System.out.println("Display - Appium");
	}
	
	@Test(groups = "Reg")
	public void Regression(){
		System.out.println("Regression - Appium");
	}
	
	@Test(groups = "Smoke")
	public void Smoke(){
		System.out.println("Smoke - Appium");
	}
}
