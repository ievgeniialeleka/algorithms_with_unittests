import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParenthesesBalanceTest {

    ParenthesesBalance pb;
    @BeforeEach
    void beforeEach() {
        pb = new ParenthesesBalance();
    }

    @AfterEach
    void afterEach() {
        pb = null;
    }
    @Test
    void getParenthesisBalance_NotBalanced_ReturnFalse() {
        boolean actual = pb.getParenthesisBalance("[(])");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void getParenthesisBalance_Balanced_ReturnTrue() {
        boolean actual = pb.getParenthesisBalance("[()()()]{}([])");
        boolean expected = true;
        assertEquals(expected, actual);
    }


}