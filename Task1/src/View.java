public class View {
    public static final String INPUT_HELLO_STRING = "Input \"Hello\" word = ";
    public static final String INPUT_WORLD_STRING = "Input \"world!\" word = ";
    public static final String WRONG_INPUT_STRING_DATA = "Wrong input! Repeat please! ";
    public static final String OUR_SENTENCE = "Sentence =";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessageAndSentence(String message, String sentence) {
        System.out.println(message + " " + sentence);
    }
}