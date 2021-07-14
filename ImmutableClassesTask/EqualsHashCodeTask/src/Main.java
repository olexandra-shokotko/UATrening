public class Main{
    public static void main(String[] args){
        Worker worker1 = new Worker("Dima", 10, "soldat");
        Worker worker2 = new Worker("Dima", 10, "soldat");
//        Worker worker2 = new Worker("Misha", 30, "kapitan");

        System.out.println(worker1 == worker2);
        System.out.println(worker1.equals(worker2));
        System.out.println(worker1.hashCode() == worker2.hashCode());
        System.out.println(worker1.hashCode());
        System.out.println(worker2.hashCode());
    }
}