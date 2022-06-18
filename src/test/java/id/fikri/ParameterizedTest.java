package id.fikri;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

public class ParameterizedTest {

    private Calculator calculator= new Calculator();


    @org.junit.jupiter.params.ParameterizedTest
    @DisplayName("Test calculator")
    @ValueSource(ints = {1,2,3,4,5,6,7,8,9,100,12})
    void test(int value){
        var expected = value + value;

        var result = calculator.add(value,value);

        Assertions.assertEquals(expected, result);
    }




    public static List<Integer> sourceIds(){
        return List.of(1,2,3,4,5,6,7,3,55,4,33);
    }

    @org.junit.jupiter.params.ParameterizedTest
    @DisplayName("Test calculator")
    @MethodSource({"sourceIds"})
    void testWithMethodSource(int value){
        var expected = value + value;

        var result = calculator.add(value,value);

        Assertions.assertEquals(expected, result);
    }
}
