package Task3.controller;

import Task3.model.ExistingLoginException;
import Task3.model.Notebook;
import Task3.model.Person;
import Task3.view.View;

import java.util.Scanner;

import static Task3.controller.FieldRules.*;
import static Task3.view.TextConstant.*;

public class InputPerson {
    private View view;
    private Scanner sc;
    private Notebook notebook;

    private String surname;
    private String login;

    public InputPerson(View view, Scanner sc, Notebook notebook) {
        this.view = view;
        this.sc = sc;
        this.notebook = notebook;
    }

    public void process() {
        fillFields();

        while (!addPersonToNotebook()) {
            fillFields();
        }
    }

    private void fillFields() {
        UtilityController utilityController = new UtilityController(sc, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_SURNAME_UKR : REGEX_SURNAME_LAT;

        this.surname = utilityController.inputStringValueWithScanner(SURNAME, str);
        this.login = utilityController.inputStringValueWithScanner(LOGIN_DATA, REGEX_LOGIN);
    }

    private boolean addPersonToNotebook() {
        try {
            notebook.createAndAddPerson(surname, login);
        } catch (ExistingLoginException m) {
            System.out.println(m);
            System.out.println("Repeat please");
            return false;
        } catch (Exception m) {
            System.out.println(m);
            return false;
        }

        for (Person p : notebook.getPersons()) {
            System.out.println(p.toString());
        }
        return true;
    }
}
