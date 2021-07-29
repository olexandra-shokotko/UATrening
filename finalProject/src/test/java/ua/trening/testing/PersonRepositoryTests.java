package ua.trening.testing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import ua.trening.testing.entity.Person;
import ua.trening.testing.repository.PersonRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class PersonRepositoryTests {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private PersonRepository repo;

    @Test
    public void testCreateUser() {
        Person user = new Person();
        user.setEmail("ravikumar@gmail.com");
        user.setPassword("ravi2020");
        user.setFirstName("Ravi");
        user.setLastName("Kumar");
        user.setLogin("kumar2020");

        Person savedUser = repo.save(user);

        Person existUser = entityManager.find(Person.class, savedUser.getId());

        assertThat(user.getEmail()).isEqualTo(existUser.getEmail());

    }
}
