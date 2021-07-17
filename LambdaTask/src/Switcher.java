import java.util.ArrayList;

public class Switcher {
    private ArrayList<ElectricityConsumer> listeners = new ArrayList<>();

    public void addElectricityListener(ElectricityConsumer listener) {
        listeners.add(listener);
    }

    public void removeElectricityListener(ElectricityConsumer listener) {
        listeners.remove(listener);
    }

    public void switchOn() {
        System.out.println("Switch ON!");
        for (ElectricityConsumer c : listeners) {
            c.electricityOn(this);
        }
    }
}
