package id.fikri;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class MockTest {


    @Test
    void testMock() {

        List<String> list = Mockito.mock(List.class);

        Mockito.when(list.get(0)).thenReturn("Fikri");
        Mockito.when(list.get(100)).thenReturn("S");


        System.out.println(list.get(0));
        System.out.println(list.get(100));

//        verify bahwa list.get(0) cuma dipanggil sekali
        Mockito.verify(list, Mockito.times(1)).get(0);
    }
}
