package base;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MyAwesomeExtension.class)
public class BaseTest {


    @BeforeAll
    public static void testBeforeAll(){
        System.out.println("BeforeAll Current thread is testBeforeAll" + Thread.currentThread().getId());

    }

    @BeforeEach
    public void testBeforeEach(){
        System.out.println("BeforeEach Current thread is testBeforeEach" + Thread.currentThread().getId());
    }



    @AfterEach()
    public void testAfterEach(){
        System.out.println("AfterEach Current thread is testAfterEach " + Thread.currentThread().getId());

    }

    @AfterAll()
    public static void testAfterAll(){
        System.out.println("AfterAll Current thread is testAfterAll " + Thread.currentThread().getId());

    }

    public void sleepInSeconds(int x){
        try {
            Thread.sleep(x* 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
