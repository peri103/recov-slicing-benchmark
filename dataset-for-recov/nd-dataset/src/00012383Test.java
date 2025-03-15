import org.junit.jupiter.api.Test;

class _00012383Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "level";
        // Block 2:
        boolean flag = true;
        // Block 3:
        int N = S.length();
        // Block 4:
        for (int i = 0; i < N / 2; i++) {
            // Block 5:
            if (S.charAt(i) != S.charAt(N - 1 - i)) {
                // Block 6:
                flag = false;
            }
        }
        // Block 7:
        for (int i = 0; i < (N - 1) / 2 - 1; i++) {
            // Block 8:
            if (S.charAt(i) != S.charAt((N - 1) / 2 - 1 - i)) {
                // Block 9:
                flag = false;
            }
        }
        // Block 10:
        for (int i = (N + 3) / 2; i < N - 1; i++) {
            // Block 11:
            if (S.charAt(i) != S.charAt(N - 1 - i)) {
                // Block 12:
                flag = false;
            }
        }
        // Block 13:
        if (flag) {
            // Block 14:
            System.out.println("Yes");
        }
        // Block 15:
        else {
            // Block 16:
            System.out.println("No");
        }
        // Block END.
    }
    }

