import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String word = "level";
        // Block 2:
        int n = word.length();
        // Block 3:
        int hanbun = (n - 1) / 2;
        // Block 4:
        int notk = 0;
        // Block 5:
        for (int i = 0; i < hanbun; i++) {
            // Block 6:
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                // Block 7:
                notk = 1;
                // Block 8:
                break;
            }
        }
        // Block 9:
        int hanbun2;
        if (hanbun % 2 == 0) {
            // Block 10:
            hanbun2 = hanbun / 2;
        }
        // Block 11:
        else {
            // Block 12:
            hanbun2 = (hanbun - 1) / 2;
        }
        // Block 13:
        for (int j = 0; j < hanbun2; j++) {
            // Block 14:
            if (word.charAt(j) != word.charAt(hanbun - j - 1)) {
                // Block 15:
                notk = 1;
                // Block 16:
                break;
            }
        }
        // Block 17:
        if (notk == 1) {
            // Block 18:
            System.out.println("No");
        }
        // Block 19:
        else {
            // Block 20:
            System.out.println("Yes");
        }
        // Block END.
    }
    }
}
