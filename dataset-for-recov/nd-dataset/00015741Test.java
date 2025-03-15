import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int X = 64145, Y = 123, Z = 456;
        // Block 2:
        int ans = X / (Y + Z);
        // Block 3:
        if (X % (Y + Z) >= Z) {
            // Block 4:
            System.out.println(ans);
        // Block 5:
        } else {
            // Block 6:
            System.out.println(ans - 1);
        }
        // Block END.
    }
    }
}
