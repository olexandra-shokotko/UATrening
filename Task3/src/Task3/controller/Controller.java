package Task3.controller;

import Task3.view.View;

import java.util.Scanner;

public class Controller {
    private View view;
    private Scanner scanner;

    public Controller(View view) {
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputPerson inputNoteNoteBook = new InputPerson(view, sc);
        inputNoteNoteBook.inputPerson();
    }

    String inputStringValueWithScanner(String message, String regex) {
        String res;
        view.printStringInput(message);
        while (!(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return res;
    }
}