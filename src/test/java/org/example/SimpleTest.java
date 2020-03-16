package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {
    private static final Logger LOG = LoggerFactory.getLogger(SimpleTest.class);

    @Test
    public void simpleTest1(){
        LOG.info("Test complete!");
    }

    @Test(enabled = false)
    public void simpleTest2(){
        LOG.info("Test complete!");
        Assert.fail();
    }
}
