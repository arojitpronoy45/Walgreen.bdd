package base;

import org.openqa.selenium.OutputType;


import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;


public class HookClass {

    static BaseClass baseClass;

    @BeforeAll
    public static void beforeAllTests(){
        baseClass = new BaseClass();
        System.out.println("------ Before All ------");
    }

    @Before
    public void beforeEachTest(){
        baseClass.setUp();
        System.out.println("------- Before -------");
    }

    @After
    public void afterEachTest(Scenario scenario){
		if(scenario.isFailed()) {
			final byte [] ss = ((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(ss, "image/png", "error.png");
		}
        baseClass.tearUp();
        System.out.println("------- After --------");
    }
}