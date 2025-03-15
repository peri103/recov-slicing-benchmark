class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 6;
        // Block 2:
        int[] A = {1, 2, 3, 2, 2, 1};
        // Block 3:
        StringBuilder li = new StringBuilder();
        // Block 4:
        for (int i = 0; i < N - 1; i++) {
            // Block 5:
            if (A[i + 1] - A[i] > 0) {
                // Block 6:
                li.append('+');
            }
            // Block 7:
            else if (A[i + 1] - A[i] < 0) {
                // Block 8:
                li.append('-');
            }
            // Block 9:
            else {
                // Block 10:
                continue;
            }
        }
        // Block 11:
        int ans = 1;
        // Block 12:
        int p = 0;
        // Block 13:
        int m = 0;
        // Block 14:
        for (int j = 0; j < li.length(); j++) {
            char i = li.charAt(j);
            // Block 15:
            if (i == '+') {
                // Block 16:
                p = 1;
            }
            // Block 17:
            else if (i == '-') {
                // Block 18:
                m = 1;
            }
            // Block 19:
            if (p == 1 && m == 1) { // Note: using && instead of &
                // Block 20:
                ans += 1;
                // Block 21:
                p = 0;
                // Block 22:
                m = 0;
            }
        }
        // Block 23:
        System.out.println(ans);
        // Block END.
    }
}
