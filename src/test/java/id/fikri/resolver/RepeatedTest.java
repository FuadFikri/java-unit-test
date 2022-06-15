package id.fikri.resolver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class RepeatedTest {

    @DisplayName("Test berulang")
    @org.junit.jupiter.api.RepeatedTest(value = 10,
        name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
    void test(TestInfo info) {
        System.out.println("print data");
    }
}
