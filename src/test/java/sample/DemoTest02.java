package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest02 {

	@Test
	public void testcase_004() {
		
		System.out.println("This is testcase 004");
	}
	
	@Test
	public void testcase_005() {
		
		System.out.println("This is testcase 005");
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods = "testcase_005")
	public void testcase_006() {
		
		System.out.println("This is testcase 006");
	}
	
	
}
