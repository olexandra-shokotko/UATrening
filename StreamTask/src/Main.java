import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, -5, 0, 33, 666, -23, 123, 0};
//        Supplier<Stream<int[]>> streamSupplier = () -> Stream.of(array);
//        Stream<int[]> stream = Stream.of(array);

        //1
        IntStream stream1 = Arrays.stream(array);
        System.out.println("First stream: " + stream1.average().getAsDouble());

        //2
        IntStream stream2 = Arrays.stream(array);


        //3
        IntStream stream3 = Arrays.stream(array);
        System.out.println("\nThird stream: " + stream3.filter(e -> e == 0).count());

        //4
        IntStream stream4 = Arrays.stream(array);
        System.out.println("\nForth stream: " + stream4.filter(e -> e > 0).count());

        //5
        IntStream stream5 = Arrays.stream(array);
        System.out.println("\nFifth stream: ");
        stream5.map(e -> e * 10).forEach(System.out::println);
    }
}
