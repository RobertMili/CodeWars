package highestAndLow;

import java.util.Arrays;
import java.util.OptionalInt;

import static java.util.Arrays.stream;

public class Main {
}
class Kata {
    public static String highAndLow(String numbers) {

        String[] strArray = numbers.split(" ");

        int[] intArray = new int[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

      OptionalInt intMin = Arrays.stream(intArray).min();
        OptionalInt intMax = Arrays.stream(intArray).max();

       String result = intMax.getAsInt() + " " + intMin.getAsInt();

        return result;
    }

    public static String highAndLowBetter(String numbers) {
        var stats = stream(numbers.split(" "))
                .mapToInt(Integer::parseInt).summaryStatistics();

        return stats.getMax() + " " + stats.getMin();
    }
}
