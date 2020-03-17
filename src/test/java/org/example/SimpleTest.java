package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

public class SimpleTest {
    private static final Logger LOG = LoggerFactory.getLogger(SimpleTest.class);

    @BeforeClass
    public void beforeSimpleTestClass(){
        LOG.info("Before class SimpleTest");
    }

    @AfterClass
    public void afterSimpleTestClass(){
        LOG.info("After class SimpleTest");
    }

    @BeforeMethod
    public void beforeMethod(){
        LOG.info("Before SimpleTest method");
    }

    @AfterMethod
    public void afterMethod(){
        LOG.info("After SimpleTest method");
    }

    @BeforeSuite
    public void beforeSuite(){
        LOG.info("Before suite");
    }

    @Test
    public void SimpleTest1(){
        LOG.info("SimpleTest1 complete!");
    }

    @Test
    public void SimpleTest2(){
        LOG.info("SimpleTest2 complete!");
    }

    @AfterSuite
    public void afterSuite(){
        LOG.info("After suite");
    }
}
