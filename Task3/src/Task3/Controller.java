package Task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    private View view;

    public Controller(View view) {
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        Notebook notebook = new Notebook();

        view.printMessage(View.INTRODUCTION);

        String surname = inputStrValueWithScanner(sc, View.INPUT_SURNAME, FieldRules.REGEX_SURNAME);
        String nickname = inputStrValueWithScanner(sc, View.INPUT_NICKNAME, FieldRules.REGEX_NICKNAME);
        Person person = new Person(surname, nickname);
        notebook.addPerson(person);
        for (Person p : notebook.getPersons()) {
            System.out.println(p.toString());
        }
    }

    public String inputStrValueWithScanner(Scanner sc, String inputStr, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        boolean matchFound;

        view.printMessage(inputStr);
        String input = sc.nextLine();

        matcher = pattern.matcher(input);
        matchFound = matcher.find();

        while (!matchFound) {
            view.printMessage(View.WRONG_INPUT_DATA + inputStr);
            input = sc.nextLine();
            matcher = pattern.matcher(input);
            matchFound = matcher.find();
        }

        return input;
    }
}
