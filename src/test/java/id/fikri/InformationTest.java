package id.fikri;

import org.junit.jupiter.api.*;

public class InformationTest {

    @Test
    @Tags({
            @Tag("satu"),
            @Tag("dua")
    })
    @DisplayName("ini test satu")
    public void testOne(TestInfo testInfo){
        System.out.println("halo");
        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTags());
        System.out.println(testInfo.getTestClass());
        System.out.println(testInfo.getTestMethod());
    }
}
