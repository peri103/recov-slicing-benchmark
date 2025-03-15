import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int a = 1;
        // Block 2:
        int b = 2;
        // Block 3:
        int c = 4;
        // Block 4:
        int d = 8;
        // Block 5:
        int e = 9;
        // Block 6:
        int k = 15;
        // Block 7:
        if (k < b - a) {
            // Block 8:
            System.out.println(":(");
        // Block 9:
        } else if (k < c - a) {
            // Block 10:
            System.out.println(":(");
        // Block 11:
        } else if (k < d - a) {
            // Block 12:
            System.out.println(":(");
        // Block 13:
        } else if (k < e - a) {
            // Block 14:
            System.out.println(":(");
        // Block 15:
        } else if (k < c - b) {
            // Block 16:
            System.out.println(":(");
        // Block 17:
        } else if (k < d - b) {
            // Block 18:
            System.out.println(":(");
        // Block 19:
        } else if (k < e - b) {
            // Block 20:
            System.out.println(":(");
        // Block 21:
        } else if (k < d - c) {
            // Block 22:
            System.out.println(":(");
        // Block 23:
        } else if (k < e - c) {
            // Block 24:
            System.out.println(":(");
        // Block 25:
        } else if (k < e - d) {
            // Block 26:
            System.out.println(":(");
        // Block 27:
        } else {
            // Block 28:
            System.out.println("Yay!");
        }
        // Block END.
    }
    }
}
