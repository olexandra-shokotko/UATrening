public class Radio implements ElectricityConsumer{
    public void radioOn() {
        System.out.println("Radio ON!");
    }

    @Override
    public void electricityOn(Object sender) {
        radioOn();
    }

}
