package id.fikri;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.Queue;

@DisplayName("A queue")
public class QueueTest {

    private Queue<String> queue;


    @Nested
    @DisplayName("when new")
    public class WhenNew{

        @BeforeEach
        void setUp(){
            queue = new LinkedList<>();
        }


        @Test
        @DisplayName("when offer, size must be 1")
        void offerNewData(){
            queue.offer("fikri");
            Assertions.assertEquals(1, queue.size());
        }

        @Test
        @DisplayName("when offer 2, size must be 2")
        void offerTwoData(){
            queue.offer("fikri");
            queue.offer("sy");
            Assertions.assertEquals(2, queue.size());
        }

    }
}
