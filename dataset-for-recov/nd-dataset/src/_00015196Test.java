import org.junit.jupiter.api.Test;

class _00015196Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int X = 64145, Y = 123, Z = 456;
        // Block 2:
        int result = X / (Y + Z) - 1;
        // Block 3:
        while (X >= (result + 1) * Y + (result + 2) * Z) {
            // Block 4:
            result += 1;
        }
        // Block 5:
        System.out.println(result);
        // Block END.
    }
    }

