import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 112;
        // Block 2:
        for (int i = N; i < 1000; i++) {
            // Block 3:
            String strI = String.valueOf(i);
            if (strI.charAt(0) == strI.charAt(1) && strI.charAt(1) == strI.charAt(2)) {
                // Block 4:
                System.out.println(i);
                // Block 5:
                break;
            }
        }
        // Block END.
    }
    }
}
