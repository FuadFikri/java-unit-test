package id.fikri;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ParentTest {

    @BeforeEach
    void setUp() {
        System.out.println("setup data");
    }


    @AfterEach
    public void clearData() {
        System.out.println("clear data");
    }
}
