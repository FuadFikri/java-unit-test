package id.fikri;

import java.util.UUID;

public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person get(String id) {
        return personRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found"));
    }


    public Person register(String name){
        var person = new Person(UUID.randomUUID().toString(), name);
        personRepository.insert(person);
        personRepository.insert(person);
        personRepository.insert(person);
        return person;
    }
}
