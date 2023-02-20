package digitMultiDigt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareDigitTest {

    @Test
    public void test() {
        assertEquals(811181, new SquareDigit().squareDigits(9119));
        assertEquals(0, new SquareDigit().squareDigits(0));
    }
    @Test
    public void test2() {
        assertEquals(416161, new SquareDigit().squareDigits(2441));

    }



}