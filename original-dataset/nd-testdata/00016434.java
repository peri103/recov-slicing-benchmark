class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 2;
        // Block 2:
        int[] a = {100, 0};
        // Block 3:
        int m = a[0];
        for (int num : a) {
            if (num > m) {
                m = num;
            }
        }
        // Block 4:
        int r = 0;
        // Block 5:
        for (int i = 0; i < n; i++) {
            // Block 6:
            if (Math.abs(m / 2.0 - a[i]) < Math.abs(m / 2.0 - r)) {
                // Block 7:
                r = a[i];
            }
        }
        // Block 8:
        System.out.println(m + " " + r);
        // Block END.
    }
}
