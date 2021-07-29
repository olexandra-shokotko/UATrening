package ua.trening.testing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.trening.testing.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
