import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 6;
        // Block 2:
        System.out.println(new String[]{"NO", "YES"}[n == 3 || n == 5 || n == 7 ? 1 : 0]);
        // Block END.
    }
    }
}
