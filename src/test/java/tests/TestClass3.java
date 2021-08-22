package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;

public class TestClass3 extends BaseTest {


    @Test()
    public void sixthTest(){
        sleepInSeconds(2);

        System.out.println("Current thread of sixthTest " + Thread.currentThread().getId());
    }

    @Test()
    public void seventhTest(){
        sleepInSeconds(2);
        System.out.println("Current thread is seventhTest " + Thread.currentThread().getId());
    }
}
