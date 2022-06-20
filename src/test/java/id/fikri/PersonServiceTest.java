package id.fikri;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

@Extensions({
        @ExtendWith(MockitoExtension.class)
})
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;


    private PersonService personService;

    @BeforeEach
    void setUp() {
        personService = new PersonService(personRepository);
    }

    @Test
    void testNotFound() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            personService.get("randomID");
        });

    }


    @Test
    void testGetPersonSuccess() {

        Mockito.when(personRepository.findById("ABC")).thenReturn(Optional.of(new Person("ABC", "FIKRI")));
        var person = personService.get("ABC");

        System.out.println(person);
        Assertions.assertNotNull(person);
        Assertions.assertEquals("ABC", person.getId());
        Assertions.assertEquals("FIKRI", person.getName());


    }
}
