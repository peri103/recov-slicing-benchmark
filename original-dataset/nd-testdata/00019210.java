class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 12;
        // Block 2:
        if (n % 2 == 1) {
            // Block 3:
            System.out.println(0);
        }
        // Block 4:
        else if (n % 2 == 0) {
            // Block 5:
            int ans = 0;
            // Block 6:
            int k = 10;
            // Block 7:
            while (n >= k) {
                // Block 8:
                ans += n / k;
                // Block 9:
                k *= 5;
            }
            // Block 10:
            System.out.println(ans);
        }
        // Block END.
    }
}
