import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, -5, 0, 33, 666, -23, 123, 0};

        //1
        IntStream stream1 = Arrays.stream(array);
        System.out.println("First stream: " + stream1.average().getAsDouble());

        //2
        IntStream stream2 = Arrays.stream(array);
        IntStream stream2new = Arrays.stream(array);
        int minElement = stream2.min().getAsInt();
        int minIndex = stream2new.boxed().collect(Collectors.toList()).indexOf(minElement);
        System.out.println("\nSecond stream: " + "min element: " + minElement + ", index of min element: " + minIndex + "\n");

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
