package Test_2;

import org.testng.annotations.Test;

public class Test_7 {
	
	@Test(priority=1,invocationCount=3)
	public void A() {
		System.out.println("A Test");	
		}
	@Test(priority=-2)
	public void B() {
		System.out.println(" B Test");
	}
	@Test(priority=3,invocationCount=3)
	public void C() {
		System.out.println(" C Test");
	}@Test(priority=0)
	public void D() {
		System.out.println(" D Test");
	}

}
