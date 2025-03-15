import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int a = 12, b = 4;
        // Block 2:
        int left = a - (b * 2);
        // Block 3:
        if (left >= 0) {
            System.out.println(left);
        } else {
            System.out.println('0');
        }
        // Block END.
    }
    }
}
