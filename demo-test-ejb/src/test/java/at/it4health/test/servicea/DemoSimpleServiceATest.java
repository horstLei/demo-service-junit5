package at.it4health.test.servicea;

import at.it4health.modulea.service.ModuleAService;
import org.jboss.arquillian.container.test.api.OperateOnDeployment;
import org.jboss.arquillian.junit5.container.annotation.ArquillianTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@ArquillianTest
public class DemoSimpleServiceATest extends BaseDemoServiceATest{

    @Inject
    ModuleAService moduleAService;

    @BeforeEach
    public void setupTest(){    
        super.init();
    }

    @Test
    @Tag("simpleTest")
    @OperateOnDeployment("app_services")
    public void functionATest(){

        System.out.println("DemoSimpleServiceATest.functionATest executed: " + moduleAService.functionA());

        assertEquals(ModuleAService.FUNCTION_A_TESTSTRING, moduleAService.functionA());

        // if enabled fails
        //fail("fails on first TestCase");
    }
}
