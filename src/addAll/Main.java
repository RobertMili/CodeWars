package addAll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
}
class Kata {
    public static int addAll(final int[]numbers) {
        List<Integer> minHead = new ArrayList<>();

        for(int rope : numbers) {
            minHead.add(rope);
        }
        Collections.sort(minHead);

        int cost = 0;
        while (minHead.size() > 1) {
            int rope1 = minHead.remove(0);
            int rope2 = minHead.remove(0);
            int combined = rope1 + rope2;
            cost += combined;
            minHead.add(combined);
            Collections.sort(minHead);
        }
        return cost;
    }
}
