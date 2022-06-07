package id.fikri;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();


    @Test
    void testAddSuccess() {
        var result = calculator.add(10,10);
        System.out.println(result);
        Assertions.assertEquals(20, result);
    }

    @DisplayName("test fail pembagian dengan 0")
    @Test
    void testDivideFail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10,0);
        });
    }
}
