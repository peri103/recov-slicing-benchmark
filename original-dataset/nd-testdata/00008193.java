class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 8, k = 3;
        // Block 2:
        int[] nums = {7, 3, 1, 8, 4, 6, 2, 5};
        // Block 3:
        int count = 0;
        // Block 4:
        while (n > 0) {
            // Block 5:
            if (n > k) {
                // Block 6:
                n -= k - 1;
            }
            // Block 7:
            else {
                // Block 8:
                n -= k;
            }
            // Block 9:
            count += 1;
        }
        // Block 10:
        System.out.println(count);
        // Block END.
    }
}
