class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 5;
        // Block 2:
        if (n % 2 == 1) {
            // Block 3:
            System.out.println(0);
        }
        // Block 4:
        else {
            // Block 5:
            int ans = 0;
            // Block 6:
            int i = 10;
            // Block 7:
            while (n / i != 0) {
                // Block 8:
                ans += (n / i);
                // Block 9:
                i *= 5;
            }
            // Block 10:
            System.out.println(ans);
        }
        // Block END.
    }
}
