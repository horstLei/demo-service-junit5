package at.it4health.test.servicea;

import at.it4health.modulea.service.ModuleAService;
import org.jboss.arquillian.container.test.api.OperateOnDeployment;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

public class DemoServiceATest extends BaseDemoServiceATest{

    @Inject
    ModuleAService moduleAService;

    @Test
    @Tag("tagToTest")
    @OperateOnDeployment("app_services")
    public void functionATest(){

        System.out.println("moduleAService executed: " + moduleAService.functionA());

        assertEquals(ModuleAService.FUNCTION_A_TESTSTRING, moduleAService.functionA() + "_test");

        //fail("test");
    }
}
