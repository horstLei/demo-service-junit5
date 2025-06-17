package at.it4health.test.suite;

import at.it4health.test.servicea.DemoSimpleServiceATest;
import at.it4health.test.serviceb.DemoSimpleServiceBTest;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("supercool demo simple service testsuite")
@IncludeTags("simpleTest")
@SelectClasses({
        DemoSimpleServiceATest.class,
        DemoSimpleServiceBTest.class
})
public class DemoSimpleServiceSuiteTest {

}
