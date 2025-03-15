class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 1, p = 1;
        // Block 2:
        int[] A = {50};
        // Block 3:
        int even = 0;
        // Block 4:
        int odd = 0;
        // Block 5:
        for (int a : A) {
            // Block 6:
            if (a % 2 == 0) {
                // Block 7:
                even += 1;
            }
            // Block 8:
            else {
                // Block 9:
                odd += 1;
            }
        }
        // Block 10:
        int ans = 0;
        // Block 11:
        if (odd == 0) {
            // Block 12:
            if (p == 0) {
                // Block 13:
                ans = (int) Math.pow(2, n);
            }
            // Block 14:
            else {
                // Block 15:
                ans = 0;
            }
        }
        // Block 16:
        else {
            // Block 17:
            ans = (int) Math.pow(2, n - 1);
        }
        // Block 18:
        System.out.println(ans);
        // Block END.
    }
}
