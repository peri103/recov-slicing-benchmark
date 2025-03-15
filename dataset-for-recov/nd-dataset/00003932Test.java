import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int x = 64146, y = 123, z = 456;
        // Block 2:
        int ans = (int) ((x - z) / (y + z));
        // Block 3:
        System.out.println(ans);
        // Block END.
    }
    }
}
