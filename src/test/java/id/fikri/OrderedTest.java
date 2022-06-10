package id.fikri;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
public class OrderedTest {

    @Test
    @Order(3)
    void test100() {
        System.out.println("test 100");

    }

    @Test
    @Order(2)
    void test2() {
        System.out.println("test2");

    }

    @Test
    @Order(1)
    void test1() {
        System.out.println("test1");
    }

}
