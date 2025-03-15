import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 750;
        // Block 2:
        int a = Integer.parseInt(String.valueOf(String.valueOf(N).charAt(0)).repeat(3));
        // Block 3:
        if (N == a) {
            // Block 4:
            System.out.println(N);
        // Block 5:
        } else if (N < a) {
            // Block 6:
            System.out.println(a);
        // Block 7:
        } else {
            // Block 8:
            System.out.println(a + 111);
        }
        // Block END.
    }
    }

