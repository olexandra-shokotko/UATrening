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

    public void addPerson(Person person) {
        persons.add(person);
    }
}
