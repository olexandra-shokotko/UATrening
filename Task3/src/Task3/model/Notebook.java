package Task3.model;

import Task3.model.Person;

import java.util.ArrayList;

public class Notebook {
    private ArrayList<Person> persons = new ArrayList<>();

    public Notebook() {
        persons.add(new Person("Kek", "kek101"));
        persons.add(new Person("Lol", "lol102"));
        persons.add(new Person("Cheburek", "cheburek103"));
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void createAndAddPerson(String surname, String login) throws ExistingLoginException{
        for (Person p : persons)
        {
            if (p.getLogin().equals(login))
                throw new ExistingLoginException("This login is not available");
        }
        persons.add(new Person(surname, login));
    }
}
