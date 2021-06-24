import java.util.Scanner;

public class Controller {
    public static final String HELLO_PATTERN = "Hello";
    public static final String WORLD_PATTERN = "world!";

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.addStringToSentence(inputStrWithScanner(sc, View.INPUT_HELLO_STRING, HELLO_PATTERN));
        model.addStringToSentence(inputStrWithScanner(sc, View.INPUT_WORLD_STRING, WORLD_PATTERN));

        view.printMessageAndSentence(View.OUR_SENTENCE, model.getSentence());
    }

    private String inputStrWithScanner(Scanner sc, String inputStr, String pattern) {
        view.printMessage(inputStr);
        String input = sc.nextLine();
        while ( !input.equals(pattern)) {
            view.printMessage(View.WRONG_INPUT_STRING_DATA + inputStr);
            input = sc.nextLine();
        }
        return input;
    }
}
