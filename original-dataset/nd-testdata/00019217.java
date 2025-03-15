class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 5;
        // Block 2:
        int k = 10;
        // Block 3:
        int ans = 0;
        // Block 4:
        if (N % 2 != 0) {
            // Block 5:
            ans = 0;
        }
        // Block 6:
        else {
            // Block 7:
            while (k <= N) {
                // Block 8:
                ans += N / k;
                // Block 9:
                k *= 5;
            }
        }
        // Block 10:
        System.out.println(ans);
        // Block END.
    }
}
