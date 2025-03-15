import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int X = 12, Y = 3, Z = 1;
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
}
