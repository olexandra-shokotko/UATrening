public class Lamp implements ElectricityConsumer{
    public void lightOn() {
        System.out.println("Lamp ON!");
    }

    @Override
    public void electricityOn(Object sender) {
        lightOn();
    }
}
