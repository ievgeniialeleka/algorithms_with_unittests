import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfixToPostfixTest {

    private InfixToPostfix infixtopostfix;

    @BeforeEach
    void beforeEach() {
        infixtopostfix = new InfixToPostfix();
    }

    @AfterEach
    void afterEach() {
        infixtopostfix = null;
    }

    @Test
    void convertInfixtoPostfix_Case1() {
        String actual = infixtopostfix.convertInfixtoPostfix("((1 + (2 * 3)) + 4)");
        String expected = "123*+4+";
        assertEquals(expected, actual);
    }

    @Test
    void convertInfixtoPostfix_Case2() {
        String actual = infixtopostfix.convertInfixtoPostfix("(((1 + 2) * 3) - ((4 - 5) * (6 + 7)))");
        String expected = "12+3*45-67+*-";
        assertEquals(expected, actual);
    }

    @Test
    void convertInfixtoPostfix_Case3() {
        String actual = infixtopostfix.convertInfixtoPostfix("((1 + 2) * (3 + 4))");
        String expected = "12+34+*";
        assertEquals(expected, actual);
    }

    @Test
    void convertInfixtoPostfix_Case4() {
        String actual = infixtopostfix.convertInfixtoPostfix("((1 * 2) + (3 * 4))");
        String expected = "12*34*+";
        assertEquals(expected, actual);
    }

    @Test
    void convertInfixtoPostfix_Case5() {
        String actual = infixtopostfix.convertInfixtoPostfix("(((1 + 2) + 3) + 4)");
        String expected = "12+3+4+";
        assertEquals(expected, actual);
    }


    @Test
    void operatorsPriority_WhenSum_Return1() {
        int actual = infixtopostfix.operatorsPriority('+');
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void operatorsPriority_WhenDifference_Return1() {
        int actual = infixtopostfix.operatorsPriority('-');
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void operatorsPriority_WhenMultiply_Return2() {
        int actual = infixtopostfix.operatorsPriority('*');
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void operatorsPriority_WhenDivision_Return2() {
        int actual = infixtopostfix.operatorsPriority('/');
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void operatorsPriority_WhenOther_Return0() {
        int actual = infixtopostfix.operatorsPriority('(');
        int expected = 0;
        assertEquals(expected, actual);
    }
}