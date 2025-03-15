import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int X = 12, Y = 3, Z = 1;
        // Block 2:
        int n = X / (Y + Z);
        // Block 3:
        if (X % (Y + Z) < Z) {
            // Block 4:
            System.out.println(n - 1);
        } else {
            // Block 5:
            System.out.println(n);
        }
        // Block END.
    }
    }
}
