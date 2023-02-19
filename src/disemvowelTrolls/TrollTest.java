package disemvowelTrolls;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrollTest {

    @Test
    void FixedTests() {
        assertEquals("Ths wbst s fr lsrs LL!",Troll.disemVowel("This website is for losers LOL!")
        );
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", Troll.disemVowel(
                "No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals( "Wht r y,  cmmnst?", Troll.disemVowel("What are you, a communist?"));
    }
}
