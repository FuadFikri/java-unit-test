package id.fikri;

import org.junit.jupiter.api.*;


@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LifecycleTest {

    private Integer n = 0;

    @Test
    @Order(3)
    void test100() {
        n++;
        System.out.println("n = " + n);

    }

    @Test
    @Order(2)
    void test2() {
        n++;
        System.out.println("n = " + n);

    }

    @Test
    @Order(1)
    void test1() {


        n++;
        System.out.println("n = " + n);
    }


}
