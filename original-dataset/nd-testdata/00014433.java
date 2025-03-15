class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 9;
        // Block 2:
        int[] A = {1, 2, 1, 2, 1, 2, 1, 2, 1};
        // Block 3:
        int cnt = 1;
        // Block 4:
        boolean top = true;
        // Block 5:
        for (int i = 1; i < N; i++) {
            // Block 6:
            if (A[i] == A[i - 1]) {
                // Block 7:
                continue;
            }
            // Block 8:
            if (top == true) {
                // Block 9:
                boolean inc = (A[i] > A[i - 1]);
                // Block 10:
                top = false;
                // Block 11:
                continue;
            }
            // Block 12:
            boolean flag = (A[i] > A[i - 1]);
            // Block 13:
            if (inc != flag) {
                // Block 14:
                cnt++;
                // Block 15:
                top = true;
            }
        }
        // Block 16:
        System.out.println(cnt);
        // Block END.
    }
}
