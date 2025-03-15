class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 8, k = 3;
        // Block 2:
        int[] a = {7, 3, 1, 8, 4, 6, 2, 5};
        // Block 3:
        int count = 1;
        // Block 4:
        n = n - k;
        // Block 5:
        while (n > 0) {
            // Block 6:
            n = n - (k - 1);
            // Block 7:
            count += 1;
        }
        // Block 8:
        System.out.println(count);
        // Block END.
    }
}
