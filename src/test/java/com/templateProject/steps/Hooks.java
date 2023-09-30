package com.templateProject.steps;

import com.templateProject.utility.ConfigurationReader;
import com.templateProject.utility.DB_Util;
import com.templateProject.utility.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before("@ui")
    public void setUp(){
        System.out.println("this is coming from BEFORE");
        Driver.getDriver().get(ConfigurationReader.getProperty("library_url"));

    }

    @After("@ui")
    public void tearDown(Scenario scenario){
        System.out.println("this is coming from AFTER");

        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }

        Driver.closeDriver();

    }


    @Before("@db")
    public void setupDB(){
        DB_Util.createConnection();
        System.out.println("connecting to database.....");

    }

    @After("@db")
    public void destroyDB(){
        DB_Util.destroy();
        System.out.println("closing connection....");

    }
}
