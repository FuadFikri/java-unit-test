package id.fikri;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionTest {


    @Test
    @EnabledOnOs(OS.WINDOWS)
    void onlyWIndows() {

    }


    @Test
    @DisabledOnOs(OS.WINDOWS)
    void disableOnWindows() {
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void runOnlyOnJava8() {
    }

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    void runOnlyOnJava11() {
    }


    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_11)
    void runOnJava8_11() {
    }

    @Test
    void testSystemProperties() {
        System.getProperties()
                .forEach((o, o2) -> {
                    System.out.println(o + " : "+  o2);
                });
    }

    @Test
    @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    void disabledOnOracle() {
    }

    @Test
    @EnabledIfSystemProperty(named = "java.vendor", matches = "Red Hat, Inc.")
    void enableOnRedhat() {
    }


    @Test
    @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    void enableOnProfileDev() {
    }
}
