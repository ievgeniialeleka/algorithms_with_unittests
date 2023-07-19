import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeftBracketsTest {

    LeftBrackets lbr;

    @BeforeEach
    void beforeEach() {
        lbr = new LeftBrackets();
    }

    @AfterEach
    void afterEach() {
        lbr = null;
    }
    @Test
    void setLeftBracketsCase1() {
        String actual = lbr.setLeftBrackets("1+2) * 3 -4))");
        String expected = "((1+2)*(3-4))";
        assertEquals(expected, actual);
    }

    @Test
    void setLeftBracketsCase2() {
        String actual = lbr.setLeftBrackets("1+2)*3-4)*5-6)))");
        String expected = "((1+2)*((3-4)*(5-6)))";
        assertEquals(expected, actual);
    }

    @Test
    void setLeftBracketsCase3() {
        String actual = lbr.setLeftBrackets("1 + 2) + 3) + 4)");
        String expected = "(((1+2)+3)+4)";
        assertEquals(expected, actual);
    }
}