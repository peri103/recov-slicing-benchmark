import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 100;
        // Block 2:
        if (n % 2 != 0) {
            // Block 3:
            n = n + 1;
        }
        // Block 4:
        System.out.println(n / 2);
        // Block END.
    }
    }
}
