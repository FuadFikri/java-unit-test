package id.fikri;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.concurrent.TimeUnit;


@Execution(value = ExecutionMode.CONCURRENT)
public class ParallelTest {


    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void slowTest1() throws InterruptedException {

        System.out.println(" start do something");
        System.out.println("long process.....");
        System.out.println("long process.....");
        Thread.sleep(3_000);
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void slowTest2() throws InterruptedException {

        System.out.println(" start do something");
        System.out.println("long process.....");
        System.out.println("long process.....");
        Thread.sleep(3_000);
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void slowTest3() throws InterruptedException {

        System.out.println(" start do something");
        System.out.println("long process.....");
        System.out.println("long process.....");
        Thread.sleep(3_000);
    }


}
