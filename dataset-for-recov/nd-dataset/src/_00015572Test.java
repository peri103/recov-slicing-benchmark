import org.junit.jupiter.api.Test;

class _00015572Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int x = 13, y = 3, z = 1;
        // Block 2:
        int temp = z;
        // Block 3:
        int result = 0;
        // Block 4:
        while (temp <= x - y - z) {
            // Block 5:
            temp = temp + y + z;
            // Block 6:
            result = result + 1;
        }
        // Block 7:
        System.out.println(result);
        // Block END.
    }
    }

