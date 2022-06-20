package id.fikri;

import java.util.Optional;

public interface PersonRepository {

    Optional<Person> findById(String id);
}
