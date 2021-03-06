package id.fikri;

import org.junit.jupiter.api.*;
import org.opentest4j.TestAbortedException;

public class CalculatorTest {

    private Calculator calculator = new Calculator();


    @Test
    void testAddSuccess() {
        var result = calculator.add(10, 10);
        System.out.println(result);
        Assertions.assertEquals(20, result);
    }

    @DisplayName("test fail pembagian dengan 0")
    @Test
    void testDivideFail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }


    @Disabled // unit test ini tidak akan di eksekusi
    @Test
    void testBelumDiBuat() {
        System.out.println("hi");
    }


    @Test
    void testAbortedException() {
        var profile = System.getenv("PROFILE");
        if (!"DEV".equalsIgnoreCase(profile)) {
            throw new TestAbortedException("test batal . ini bukan dev env !");
        }

//        unit test untuk dev
    }


    @Test
    void testAssumption() {

        Assumptions.assumeTrue("DEV".equalsIgnoreCase(System.getenv("PROFILE")));

        //test untuk dev
    }
}
