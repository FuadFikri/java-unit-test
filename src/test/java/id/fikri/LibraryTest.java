package id.fikri;

import org.junit.jupiter.api.*;

public class LibraryTest {

    private Library library = new Library();

    @BeforeAll
    public  static  void beforeAll() {
        System.out.println("before All");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    @BeforeEach
    void setup() {
        System.out.println("setup data");
        library.addBook("Book A");
        library.addBook("Book B");
        library.addBook("Book C");
        library.addBook("Book D");
        library.addBook("Book E");
    }

    @Test
    void testGetData() {
        var result = library.getBooks();
        System.out.println("result " + result);
        Assertions.assertEquals(false, result.isEmpty());
    }


    @AfterEach
    void after() {
        System.out.println("clear data");
        library.clearBooks();
    }
}
