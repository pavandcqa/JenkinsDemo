package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest01 {

	@Test
	public void testcase_001() {
		
		System.out.println("This is testcase 001");
	}
	
	@Test
	public void testcase_002() {
		
		System.out.println("This is testcase 002");
		Assert.assertTrue(false);
	}
	
	@Test
	public void testcase_003() {
		
		System.out.println("This is testcase 003");
	}
	
	
}
