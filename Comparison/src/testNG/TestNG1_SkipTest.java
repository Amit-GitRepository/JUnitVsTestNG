package testNG;

import org.testng.annotations.Test;

//When you execute the test there is no way to check in reports whether test is skipped or not, which is not the case with JUnit
public class TestNG1_SkipTest {

	
	@Test
	public void test1(){
		System.out.println("In test 1");
	}
	
	@Test
	public void test2(){
		System.out.println("In test 2");
	}
	
	@Test(enabled = false)
	public void test3(){
		System.out.println("In test 3");
	}
	
}

