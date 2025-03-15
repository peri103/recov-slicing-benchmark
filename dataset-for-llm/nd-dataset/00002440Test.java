import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 4, m = 3;
        // Block 2:
        int eve = (n * (n - 1)) / 2;
        // Block 3:
        int odd = (m * (m - 1)) / 2;
        // Block 4:
        System.out.println(eve + odd);
        // Block END.
    }
    }
}
