package at.it4health.test.serviceb;

import at.it4health.modulea.service.ModuleAService;
import org.jboss.arquillian.container.test.api.OperateOnDeployment;
import org.jboss.arquillian.junit5.container.annotation.ArquillianTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@ArquillianTest
public class DemoServiceBTest extends BaseDemoServiceBTest {

    @Test
    @Tag("failOnFirst")
    @OperateOnDeployment("app_services")
    public void functionATest() {

        System.out.println("DemoServiceBTest.functionATest executed...");
        fail("fail is not called");
    }

    @Test
    @Tag("failOnSecond")
    @OperateOnDeployment("app_services")
    public void functionBTest() {
        System.out.println("DemoServiceBTest.functionBTest executed...");
        fail("fail is not called");
    }

    @Test
    @Tag("assertOnFirst")
    @OperateOnDeployment("app_services")
    public void functionCTest() {
        System.out.println("DemoServiceBTest.functionCTest executed..." + Integer.valueOf(1).equals(Integer.valueOf(-1)));
        assertNotEquals(1, 1);
        assertEquals(1, -1);
        fail("fail is not called");
    }

    @Test
    @Tag("assertOnSecond")
    @OperateOnDeployment("app_services")
    public void functionDTest() {
        System.out.println("DemoServiceBTest.functionDTest executed...");
        assertEquals(1, -1);
    }
}
