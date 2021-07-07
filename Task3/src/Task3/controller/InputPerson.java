package Task3.controller;

import Task3.view.View;

import java.util.Scanner;

import static Task3.controller.FieldRules.*;
import static Task3.view.TextConstant.*;

public class InputPerson {
    private View view;
    private Scanner sc;

    private String surname;
    private String login;

    public InputPerson(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputPerson() {
        UtilityController utilityController = new UtilityController(sc, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_SURNAME_UKR : REGEX_SURNAME_LAT;

        this.surname = utilityController.inputStringValueWithScanner(SURNAME, str);
        this.login = utilityController.inputStringValueWithScanner(LOGIN_DATA, REGEX_LOGIN);
    }
}
