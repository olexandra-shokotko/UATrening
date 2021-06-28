import java.util.ArrayList;
import java.util.Random;

public class Model {
    private int value;
    public ArrayList<Integer> values = new ArrayList<Integer>();
    private int randNumber;
    private int minStart = 0;
    private int maxStart = 10;
    private int minCur = minStart;
    private int maxCur = maxStart;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        values.add(new Integer(value));
    }

    public void initRandNumber() {
        Random random = new Random();
        randNumber = random.nextInt(maxStart - minStart) + minStart;
    }

    public int getRandNumber() {
        return randNumber;
    }

    public boolean isGuessed() {
        if (value != randNumber) {
            if (value < randNumber) {
                maxCur = value - 1;
            }
            minCur = value;
            return false;
        }
        return true;
    }

    public boolean isNeededGreater()
    {
        if (value < randNumber)
        {
            return true;
        }
        return false;
    }
}