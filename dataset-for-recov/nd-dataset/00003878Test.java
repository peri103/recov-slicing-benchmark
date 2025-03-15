import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int X = 64145, Y = 123, Z = 456;
        // Block 2:
        X -= 2 * Z;
        // Block 3:
        X -= Y;
        // Block 4:
        int ans = 0;
        // Block 5:
        if (0 <= X) {
            // Block 6:
            ans = 1 + X / (Y + Z);
        }
        // Block 7:
        System.out.println(ans);
        // Block END.
    }
    }

