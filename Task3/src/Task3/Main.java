package Task3;

import Task3.controller.Controller;
import Task3.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Controller controller = new Controller(view);
        controller.processUser();
    }
}
