package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


//When you execute the test there is no way to check in reports whether test is skipped or not, which is not the case with JUnit
public class TestNG3_Parameterization {

	
	@Test
	public void test1(){
		System.out.println("In test 1");
	}
	
	@Test()
	@Parameters("myParameter")
	public void test2(String arg){
		System.out.println("In test 3 with Parameter : " + arg);
	}
	
}

