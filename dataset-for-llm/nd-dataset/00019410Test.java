import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        long n = 999999999;
        // Block 2:
        System.out.println(n % 2 == 0 ? n : 2 * n);
        // Block END.
    }
    }
}
