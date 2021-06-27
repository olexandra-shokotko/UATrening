public class View {
    // Text's constants
    public static final String INTRODUCTION = "Game: guess the number in range from 0 to 10";
    public static final String INPUT_INT_DATA = "Input integer number = ";
    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! Input ONLY integer values.";
    public static final String NOT_GUESSED_NEED_GREATER = "No! Greater";
    public static final String NOT_GUESSED_NEED_LESS = "No! Less";
    public static final String GUESSED = "Yes!!! You guessed!";
//    public static final String OUR_INT = "INT value = ";

    public void printMessage(String message) {
        System.out.println(message);
    }
}