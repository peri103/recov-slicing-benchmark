import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "1111111111";
        // Block 2:
        int N = S.length();
        // Block 3:
        int ans = 1000;
        // Block 4:
        for (int i = 0; i < N - 2; i++) {
            // Block 5:
            ans = Math.min(ans, Math.abs(753 - (Character.getNumericValue(S.charAt(i)) * 100 + 
                                                  Character.getNumericValue(S.charAt(i + 1)) * 10 + 
                                                  Character.getNumericValue(S.charAt(i + 2)))));
        }
        // Block 6:
        System.out.println(ans);
        // Block END.
    }
    }
}
