package Task2;

public class Main {
    public static void main(String[] args) {
        ICustom<Integer> ints = new CustomArrayList<>();

        System.out.println(ints.size());
        ints.add(new Integer(10));
        System.out.println(ints.size());
        ints.add(new Integer(20));
        ints.add(new Integer(30));
        System.out.println(ints.size());
        System.out.println(ints.get(0));
        System.out.println(ints.get(1));
        System.out.println(ints.get(2));
//        ints.delete(3);

    }
}
