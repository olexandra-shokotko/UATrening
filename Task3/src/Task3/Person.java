package Task3;

public class Person {
    private String surname;
    private String nickname;

    public Person(String surname, String nickname) {
        this.surname = surname;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Surname: " + surname + ", Nickname: " + nickname;
    }
}
