package PlayingTask;

import java.util.ArrayList;
import java.util.Random;

public class Model {
    private int value;
    private ArrayList<Integer> values = new ArrayList<Integer>();
    private int randNumber;
    private int minValue = 0;
    private int maxValue = 100;

    public void setValue(int value) {
        this.value = value;
        values.add(value);
    }

    public int getValue() {
        return value;
    }

    public ArrayList<Integer> getValues() {
        return values;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void initRandNumber() {
        Random random = new Random();
        randNumber = random.nextInt(maxValue - minValue) + minValue;
    }

    public int getRandNumber() {
        return randNumber;
    }

    public boolean isGuessed() {
        return value == randNumber;
    }

    public boolean isNeededGreater() {
        return value < randNumber;
    }
}