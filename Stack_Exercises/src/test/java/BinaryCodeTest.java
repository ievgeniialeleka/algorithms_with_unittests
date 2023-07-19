import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryCodeTest {

    BinaryCode bc;

    @BeforeEach
    void beforeEach() {
        bc = new BinaryCode();
    }

    @AfterEach
    void afterEach() {
        bc = null;
    }

    @Test
    void decimalToBinary_Nis50_Return_110010() {
       int actual = bc.decimalToBinary(50);
       int expected = 110010;
       assertEquals(expected, actual);
    }

    @Test
    void decimalToBinary_Nis10_Return_1010() {
        int actual = bc.decimalToBinary(10);
        int expected = 1010;
        assertEquals(expected, actual);
    }
}