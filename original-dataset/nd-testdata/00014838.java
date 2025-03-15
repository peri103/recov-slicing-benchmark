class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 2, P = 0;
        // Block 2:
        int[] A = {1, 3};
        // Block 3:
        int dp0 = 1;
        // Block 4:
        int dp1 = 0;
        // Block 5:
        for (int a : A) {
            // Block 6:
            if ((a & 1) == 1) {
                // Block 7:
                int new0 = dp0 + dp1;
                // Block 8:
                int new1 = new0;
                // Block 9:
            } else {
                // Block 10:
                int new0 = dp0 * 2;
                // Block 11:
                int new1 = dp1 * 2;
            }
            // Block 12:
            dp0 = new0;
            // Block 13:
            dp1 = new1;
        }
        // Block 14:
        System.out.println((P & 1) == 1 ? dp1 : dp0);
        // Block END.
    }
}
