package BitOperations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    @Test
    void findNumber() {
        assertEquals(Task1.findNumber(new int[]{1, 2, 1, 2, 4}), 4);
        assertEquals(Task1.findNumber(new int[]{0, 34, 34, 9, 0}), 9);
        assertEquals(Task1.findNumber(new int[]{11, 28, 31, 28, 11}), 31);
        assertEquals(Task1.findNumber(new int[]{94, 34, 1, 34, 1, 10, 10, 130, 135, 130, 135}), 94);
    }
}