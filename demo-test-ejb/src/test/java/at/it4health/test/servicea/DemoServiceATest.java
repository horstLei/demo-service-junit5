package at.it4health.test.servicea;

import at.it4health.modulea.service.ModuleAService;
import org.jboss.arquillian.container.test.api.OperateOnDeployment;
import org.jboss.arquillian.junit5.container.annotation.ArquillianTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

@ArquillianTest
public class DemoServiceATest extends BaseDemoServiceATest{

    @Inject
    ModuleAService moduleAService;

    @BeforeEach
    public void setupTest(){    
        super.init();
    }

    @Test
    @Tag("failOnFirst")
    @OperateOnDeployment("app_services")
    public void functionATest(){

        System.out.println("DemoServiceBTest.functionATest executed: " + moduleAService.functionA());

        assertEquals(ModuleAService.FUNCTION_A_TESTSTRING, moduleAService.functionA());

        // if enabled fails
        fail("fails on first TestCase");
    }

    @Test
    @Tag("failOnSecond")
    @OperateOnDeployment("app_services")
    public void functionBTest(){

        System.out.println("DemoServiceBTest.functionBTest executed: " + moduleAService.functionA());

        assertEquals(ModuleAService.FUNCTION_A_TESTSTRING, moduleAService.functionA());
    }

    @Test
    @Tag("assertOnFirst")
    @OperateOnDeployment("app_services")
    public void functionCTest(){

        System.out.println("DemoServiceBTest.functionCTest executed: " + moduleAService.functionA());

        assertEquals(ModuleAService.FUNCTION_A_TESTSTRING, moduleAService.functionA());
    }

    @Test
    @Tag("assertOnSecond")
    @OperateOnDeployment("app_services")
    public void functionDTest(){

        System.out.println("DemoServiceBTest.functionDTest executed: " + moduleAService.functionA());

        assertEquals(ModuleAService.FUNCTION_A_TESTSTRING, moduleAService.functionA() + "_test");
    }
}
