package at.it4health.test.serviceb;

import org.jboss.arquillian.container.test.api.OperateOnDeployment;
import org.jboss.arquillian.junit5.container.annotation.ArquillianTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@ArquillianTest
public class DemoSimpleServiceBTest extends BaseDemoServiceBTest {

    @Test
    @Tag("simpleTest")
    @OperateOnDeployment("app_services")
    public void functionATest() {

        System.out.println("DemoSimpleServiceBTest.functionATest executed...");
        fail("fail is not called");
    }

}
