package SeleniumFramework;

import org.testng.annotations.Test;

public class APITest {
	
	@Test(groups = "sampleTest")
	public void sampleTestAPI(){
		System.out.println("Sample Test - API");
	}
	
	@Test
	public void displayAPI(){
		System.out.println("Display - API");
	}

	@Test(groups = "Reg")
	public void Regression(){
		System.out.println("Regression - API");
	}
	
	@Test(groups = "Smoke")
	public void Smoke(){
		System.out.println("Smoke - API");
	}
}
