import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h = 3;
        // Block 2:
        int w = 7;
        // Block 3:
        int n = 10;
        // Block 4:
        System.out.println(Math.min((int) Math.ceil((double) n / h), (int) Math.ceil((double) n / w)));
        // Block END.
    }
    }
}
