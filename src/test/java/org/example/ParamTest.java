package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

public class ParamTest {
    private static final Logger LOG = LoggerFactory.getLogger(ParamTest.class);

    @DataProvider(name = "Имена")
    private Object[][] dataProvider(){
        return new Object[][] {
                {"Vasily", 46},
                {"Ivan", 35},
                {"Valera", 33}
        };
    }

    @Test(dataProvider = "Имена")
    public void paramTest1(String name, int age){
        String output = String.format("Name: '%s' | Age: '%d'", name, age);
        LOG.info(output);
    }
}
