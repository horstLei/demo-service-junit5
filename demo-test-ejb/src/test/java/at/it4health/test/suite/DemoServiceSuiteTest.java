package at.it4health.test.suite;

import at.it4health.test.servicea.DemoServiceATest;
import at.it4health.test.serviceb.DemoServiceBTest;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("supercool demo service testsuite")
@IncludeTags("tagToTest")
@SelectClasses({
        DemoServiceATest.class,
        DemoServiceBTest.class
})
public class DemoServiceSuiteTest {

    // fails on no tests found with this tag
}
