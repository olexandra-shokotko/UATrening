package Task2Version2;

public class Main {
    public static void main(String[] args) {
        OwnArrayList<Integer> list = new OwnArrayList<>();

        System.out.println(list.size());
        list.add(10);
        System.out.println(list.size());
        list.add(20);
        list.add(30);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        list.remove(3);
        list.set(0, 100);
    }
}
