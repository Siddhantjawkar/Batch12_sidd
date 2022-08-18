package Test_2;

import org.testng.annotations.Test;

public class Test_8 {
	
	@Test
	public void A() {
		System.out.println("A");
	}
	@Test(dependsOnMethods="A")
	public void C() {
		System.out.println("C");
		
	}
	
	
	
	
	

}
