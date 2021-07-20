package Task2;

public class Main {
    public static void main(String[] args) {
        ICustom<Integer> ints = new CustomArrayList<>();

        try {
            System.out.println(ints.size());
            ints.add(10);
            System.out.println(ints.size());
            ints.add(20);
            ints.add(30);
            System.out.println(ints.size());
            System.out.println(ints.get(0));
            System.out.println(ints.get(1));
            System.out.println(ints.get(2));


            for (Integer i : ints) {
                System.out.println(i);
            }
            ints.delete(3);

        }catch (InvalidOperationException ex){
            System.err.println(ex.getMessage());
        }
    }
}
