package id.fikri;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;



public class TagTest {

    @Test
    @Tag("tag1")
    void myTest1() {
        System.out.println(" test 1");
    }

    @Test
    @Tag("tag2")
    void myTest2() {
        System.out.println(" test 2");
    }
}
