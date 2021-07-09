package Task3.model;

public class Person {
    private String surname;
    private String login;

    public Person(String surname, String login) {
        this.surname = surname;
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Surname: " + surname + ", login: " + login;
    }
}
