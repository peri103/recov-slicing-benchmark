import org.junit.jupiter.api.Test;

class _00015297Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int X = 12, Y = 3, Z = 1;
        // Block 2:
        int answer = 0;
        // Block 3:
        int width = Y + 2 * Z;
        // Block 4:
        while (width <= X) {
            // Block 5:
            answer += 1;
            // Block 6:
            width += Y + Z;
        }
        // Block 7:
        System.out.println(answer);
        // Block END.
    }
    }

