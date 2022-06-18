package id.fikri;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TimeoutTest {


    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void slowTest() throws InterruptedException {

        System.out.println(" start do something");
        System.out.println("long process.....");
        System.out.println("long process.....");
        Thread.sleep(7_000);

    }
}
