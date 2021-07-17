public class Main {
    public static void fire(Object sender) {
        System.out.println("Fire!!!");
    }

    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        switcher.addElectricityListener(lamp);
        switcher.addElectricityListener(radio);

        String message = "Fire";
        switcher.addElectricityListener(
                new ElectricityConsumer() {
                    public void electricityOn(Object sender) {
                        System.out.println(message);
                    }
                }
        );
        switcher.addElectricityListener(sender -> Main.fire(sender));
//        switcher.addElectricityListener(Main::fire);

        switcher.switchOn();
    }
}
