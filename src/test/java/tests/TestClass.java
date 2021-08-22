package tests;

import base.BaseTest;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestClass extends BaseTest {


    @Test()
    public void firstTest(){
        System.out.println("Current thread is firstTest " + Thread.currentThread().getId());
        sleepInSeconds(2);
        Assert.assertTrue(false);

    }

    @Test()
    public void secondTest(){
        sleepInSeconds(2);
        System.out.println("Current thread is secondTest " + Thread.currentThread().getId());
    }
}
