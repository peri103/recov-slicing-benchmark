class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 5;
        // Block 2:
        int[] A = {3, 2, 2, 4, 1};
        // Block 3:
        int[] B = {1, 2, 2, 2, 1};
        // Block 4:
        int ans = 0;
        // Block 5:
        for (int i = 0; i < N; i++) {
            // Block 6:
            int ans_ = 0;
            for (int j = 0; j <= i; j++) {
                ans_ += A[j];
            }
            // Block 7:
            for (int j = i; j < N; j++) {
                ans_ += B[j];
            }
            // Block 8:
            ans = Math.max(ans, ans_);
        }
        // Block 9:
        System.out.println(ans);
        // Block END.
    }
}
