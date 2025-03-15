import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int a = 20, b = 15;
        // Block 2:
        int num = a - (2 * b);
        // Block 3:
        if (num >= 0) {
            // Block 4:
            System.out.println(num);
        }
        // Block 5:
        else {
            System.out.println(0);
        }
        // Block END.
    }
    }
}
