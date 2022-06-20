package id.fikri;

public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person get(String id) {
        return personRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found"));
    }
}
