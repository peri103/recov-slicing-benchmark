import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int X = 12, Y = 3, Z = 1;
        // Block 2:
        int cnt = 0;
        // Block 3:
        while ((X - Z) >= (Z + Y)) {
            // Block 4:
            X -= (Z + Y);
            // Block 5:
            cnt += 1;
        }
        // Block 6:
        System.out.println(cnt);
        // Block END.
    }
    }
}
