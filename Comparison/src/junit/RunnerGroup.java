package junit;

import org.junit.runner.RunWith;

@RunWith(RunnerGroup.class)
@Suite.SuiteClasses({
	JunitTest1_SkipTest.class,
	JunitTest4_BeforeClass.class
})
public class RunnerGroup {

}
