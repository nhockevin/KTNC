package poly.testmaven;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testEvenNumberPass() {
        assertTrue(App.isEvenNumber(2));
        assertTrue(App.isEvenNumber(4));
    }
}
