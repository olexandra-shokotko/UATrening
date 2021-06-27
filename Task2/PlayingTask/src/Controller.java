import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        view.printMessage(View.INTRODUCTION);
        model.initRandNumber();


        model.setValue(inputIntValueWithScanner(sc));
        while (!model.isGuessed()) {
            if (model.isNeededGreater()) {
                view.printMessage(View.NOT_GUESSED_NEED_GREATER);
            } else {
                view.printMessage(View.NOT_GUESSED_NEED_LESS);
            }
            model.setValue(inputIntValueWithScanner(sc));
        }
        view.printMessage(View.GUESSED);
    }

    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_INT_DATA);

        while (!sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_DATA + "\n" + View.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }
}