class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 4;
        // Block 2:
        int[] a = {1, 1, 1, 1};
        // Block 3:
        int[] b = {1, 1, 1, 1};
        // Block 4:
        int ans = 0;
        // Block 5:
        for (int i = 0; i < n; i++) {
            // Block 6:
            int z = 0;
            // Block 7:
            for (int j = 0; j <= i; j++) {
                // Block 8:
                z += a[j];
            }
            // Block 9:
            for (int j = i; j < n; j++) {
                // Block 10:
                z += b[j];
            }
            // Block 11:
            ans = Math.max(ans, z);
        }
        // Block 12:
        System.out.println(ans);
        // Block END.
    }
}
