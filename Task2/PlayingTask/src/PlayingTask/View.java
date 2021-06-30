package PlayingTask;

import java.util.ArrayList;

public class View {
    public static final String INTRODUCTION = "Game: guess the number in range from %d to %d\n";
    public static final String INPUT_INT_DATA = "Input integer number = ";
    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! Input ONLY integer values.";
    public static final String WRONG_INPUT_DATA_RANGE = "Wrong input! Repeat please! Input values in range from %d to %d.";
    public static final String NOT_GUESSED_NEED_GREATER = "No! Greater";
    public static final String NOT_GUESSED_NEED_LESS = "No! Less";
    public static final String GUESSED = "Yes!!! You guessed!";
    public static final String PREVIOUS_INPUTS = "\nYours previous inputs: ";
    public static final String STATISTICS = "\nStatistics: \n";
    public static final String GUESSED_NUMBER = "Guessed number: ";
    public static final String QUANTITY_OF_INPUTS = "Quantity of inputs: ";
    public static final String USER_INPUTS = "All yours inputs: ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printRangeInfo(String message, int min, int max) {
        System.out.format(message, min, max);
    }

    public void printPrevInputsInfo(ArrayList<Integer> inputs) {
        System.out.println(PREVIOUS_INPUTS + inputs.toString());
    }

    public void printStatistics(int guessedNum, ArrayList<Integer> inputs) {
        System.out.println(STATISTICS + GUESSED_NUMBER + guessedNum);
        System.out.println(QUANTITY_OF_INPUTS + inputs.size());
        System.out.println(USER_INPUTS + inputs.toString());
    }
}