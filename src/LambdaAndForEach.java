import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaAndForEach {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(9, 7, 7, 5, 2, 1));
//        numbers.add(9);
//        numbers.add(7);
//        numbers.add(7);
//        numbers.add(5);
//        numbers.add(2);
//        numbers.add(1);
        System.out.println("list of integers\n" + numbers);
        System.out.println("");


        System.out.println("========== lambda ==========");
        numbers.forEach((n) -> {
            System.out.printf("%d\n", n);
        });

        System.out.println("========== forEach ==========");
        for (Integer x : numbers) {
            System.out.printf("%d\n", x);
        }

        System.out.println("========== for ==========");
        for (int y = 0; y < numbers.size(); y++) {
            System.out.printf("%d\n", numbers.get(y));
        }
    }
}
