package junit;
import org.junit.Ignore;
import org.junit.Test;
//When you execute the test skipped test is shown in reports
public class JunitTest1_SkipTest {

	
	@Test
	public void test1(){
		System.out.println("In test 1");
	}
	
	@Test
	public void test2(){
		System.out.println("In test 2");
	}
	
	@Ignore
	@Test
	public void test3(){
		System.out.println("In test 3");
	}
	
}

