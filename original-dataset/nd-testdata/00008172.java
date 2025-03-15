class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 8, k = 3;
        // Block 2:
        int[] a = {7, 3, 1, 8, 4, 6, 2, 5};
        // Block 3:
        int ans = a.length;
        // Block 4:
        ans -= k;
        // Block 5:
        if (ans % (k - 1) == 0) {
            // Block 6:
            System.out.println(ans / (k - 1) + 1);
        }
        // Block 7:
        else {
            // Block 8:
            System.out.println(ans / (k - 1) + 2);
        }
        // Block END.
    }
}
