package digitMultiDigt;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
}

class SquareDigit {
    public int squareDigits(int n) {

        String strDigits = String.valueOf(n);
        String result = "";

        for(char c : strDigits.toCharArray()) {
            int digit = Character.digit(c,10);
            System.out.println("c:" + c);
            result += digit* digit;
        }
        return Integer.parseInt(result);
    }
}
