package PlayingTask;

import java.util.ArrayList;

public class Model {
    private int value;
    private ArrayList<Integer> values = new ArrayList<Integer>();
    private int randNumber;
    private int minValue;
    private int maxValue;

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
        randNumber = (int) Math.ceil(Math.random() * (maxValue - minValue - 1) + minValue);
    }

    public int getRandNumber() {
        return randNumber;
    }

    public void setPrimaryBarrier(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public boolean isGuessed() {
        if (value == randNumber) {
            return true;
        } else if (value > randNumber) {
            maxValue = value;
        } else {
            minValue = value;
        }
        return false;
    }

    public boolean isNeededGreater() {
        return value < randNumber;
    }
}