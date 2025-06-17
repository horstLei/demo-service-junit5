package at.it4health.test.suite;

import at.it4health.test.servicea.DemoServiceATest;
import at.it4health.test.serviceb.DemoServiceBTest;
import org.junit.platform.suite.api.*;

@Suite
@SuiteDisplayName("supercool demo service testsuite")
@IncludeTags("failOnFirst")
@ExcludeTags({"assertOnFirst", "assertOnSecond", "failOnSecond"})
@SelectClasses({
        DemoServiceATest.class,
        DemoServiceBTest.class
})
public class DemoServiceSuiteFailOnFirstTest {

}
