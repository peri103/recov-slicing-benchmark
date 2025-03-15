class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 5;
        // Block 2:
        int[] p = {3, 2, 2, 4, 1};
        // Block 3:
        int[] q = {1, 2, 2, 2, 1};
        // Block 4:
        int ans = 0;
        for (int value : p) {
            ans += value;
        }
        ans += q[n - 1];
        // Block 5:
        int tmp = ans;
        // Block 6:
        for (int i = 0; i < n - 1; i++) {
            // Block 7:
            tmp = tmp + q[n - i - 2] - p[n - i - 1];
            // Block 8:
            ans = Math.max(ans, tmp);
        }
        // Block 9:
        System.out.println(ans);
        // Block END.
    }
}
