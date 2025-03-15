class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 7;
        // Block 2:
        int[] a = {1, 2, 3, 2, 1, 999999999, 1000000000};
        // Block 3:
        int status = 0;
        // Block 4:
        int ans = 1;
        // Block 5:
        for (int i = 1; i < n; i++) {
            // Block 6:
            if (status == 0) {
                // Block 7:
                if (a[i - 1] < a[i]) {
                    // Block 8:
                    status = 1;
                }
                // Block 9:
                else if (a[i - 1] > a[i]) {
                    // Block 10:
                    status = 2;
                }
            }
            // Block 11:
            else if (status == 1) {
                // Block 12:
                if (a[i - 1] > a[i]) {
                    // Block 13:
                    ans += 1;
                    // Block 14:
                    status = 0;
                }
            }
            // Block 15:
            else if (status == 2) {
                // Block 16:
                if (a[i - 1] < a[i]) {
                    // Block 17:
                    ans += 1;
                    // Block 18:
                    status = 0;
                }
            }
        }
        // Block 19:
        System.out.println(ans);
        // Block END.
    }
}
