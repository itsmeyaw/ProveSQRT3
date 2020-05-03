import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTest {
    @Test
    @DisplayName("Basic Test using Values on Video")
    public void testBasic() {
        assertEquals(8, Main.sqrt3(512));
        assertEquals(17, Main.sqrt3(4913));
        assertEquals(18, Main.sqrt3(5832));
    }

    @Test
    @DisplayName("Real Case testing using Various Values")
    public void testActual() {
        int REPTIME = 10000; // JUMLAH TEST CASE
        int failedTest = 0; // COUNTER
        int i;
        for (i = 0; i <= REPTIME; i++) {
            try {
                assertEquals(i, Main.sqrt3((int) Math.pow(i, 3)));
            } catch (AssertionFailedError e) {
                System.err.println(e.toString());
                failedTest++;
            }
        }
        assertEquals(0, failedTest, "From " + (i-1) + " test cases, the method has failed " + failedTest + " cases.");
    }
}
