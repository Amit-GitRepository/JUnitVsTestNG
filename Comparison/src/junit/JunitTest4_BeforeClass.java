package junit;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
//When you execute the test skipped test is shown in reports
public class JunitTest4_BeforeClass {

	@BeforeClass
	public static void oneTimeSetUp() {
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

