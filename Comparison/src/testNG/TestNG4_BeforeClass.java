package testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//When you execute the test there is no way to check in reports whether test is skipped or not, which is not the case with JUnit
public class TestNG4_BeforeClass {

	@BeforeClass
	public void oneTimeSetUp() {
		// one-time initialization code
		System.out.println("@BeforeClass - oneTimeSetUp");
	}

	@Test
	public void test1(){
		System.out.println("In test 1");
	}

	@Test
	public void test2(){
		System.out.println("In test 2");
	}


}

