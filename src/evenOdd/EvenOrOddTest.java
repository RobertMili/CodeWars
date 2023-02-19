package evenOdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {
    @Test
    public void testEvenOrOdd() {
        Solution eoo = new Solution();
        assertEquals("Even", Solution.evenOrOdd(6));
        assertEquals("Odd", Solution.evenOrOdd(7));
        assertEquals("Even", Solution.evenOrOdd(0));
        assertEquals("Odd", Solution.evenOrOdd(-1));
    }

}