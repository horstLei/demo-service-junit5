package at.it4health.test.serviceb;

import at.it4health.modulea.service.ModuleAService;
import org.jboss.arquillian.container.test.api.OperateOnDeployment;
import org.jboss.arquillian.junit5.container.annotation.ArquillianTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@ArquillianTest
public class DemoServiceBTest extends BaseDemoServiceBTest {

    @Test
    @Tag("failOnFirst")
    @OperateOnDeployment("app_services")
    public void functionATest() {

        System.out.println("functionATest executed...");
        fail("fail is not called");
    }

    @Test
    @Tag("failOnSecond")
    @OperateOnDeployment("app_services")
    public void functionBTest() {
        System.out.println("functionBTest executed...");
        fail("fail is not called");
    }

    @Test
    @Tag("assertOnFirst")
    @OperateOnDeployment("app_services")
    public void functionCTest() {
        System.out.println("functionCTest executed...");
        assertEquals(1, 1);
    }

    @Test
    @Tag("assertOnSecond")
    @OperateOnDeployment("app_services")
    public void functionDTest() {
        System.out.println("functionDTest executed...");
        assertEquals(1, -1);
    }
}
