package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;

public class TestClass2 extends BaseTest {


    @Test()
    public void thirdTest(){
        sleepInSeconds(2);
        System.out.println("Current thread of thirdTest " + Thread.currentThread().getId());
    }

    @Test()
    public void fourthTest(){
        sleepInSeconds(2);
        System.out.println("Current thread is fourthTest " + Thread.currentThread().getId());
    }
}
