class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 2, p = 0;
        // Block 2:
        int[] a = {1, 3};
        // Block 3:
        int count = 0;
        // Block 4:
        for (int i : a) {
            // Block 5:
            if (i % 2 == 0) {
                // Block 6:
                count += 1;
            }
        }
        // Block 7:
        if (count == n) {
            // Block 8:
            if (p == 1) {
                // Block 9:
                System.out.println(0);
            }
            // Block 10:
            else {
                // Block 11:
                System.out.println(Math.pow(2, n));
            }
        }
        // Block 12:
        else {
            // Block 13:
            System.out.println(Math.pow(2, n - 1));
        }
        // Block END.
    }
}
