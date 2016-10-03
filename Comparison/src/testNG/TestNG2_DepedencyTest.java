package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

//When you execute the test there is no way to check in reports whether test is skipped or not, which is not the case with JUnit
public class TestNG2_DepedencyTest {

	
	@Test
	public void test1(){
		System.out.println("In test 1");
	}
	
	@Test(dependsOnMethods="test1")
	public void test2(){
		System.out.println("In test 2");
		Assert.fail();
	}
	
	@Test(dependsOnMethods="test2")
	public void test3(){
		System.out.println("In test 3");
	}
	
}

