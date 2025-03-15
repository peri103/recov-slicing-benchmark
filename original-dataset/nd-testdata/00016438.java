class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 2;
        // Block 2:
        int[] a = {100, 0};
        // Block 3:
        int n = 0;
        for (int i = 0; i < a.length; i++) {
            n = Math.max(n, a[i]);
        }
        // Block 4:
        int r = 0;
        // Block 5:
        for (int i = 0; i < N; i++) {
            // Block 6:
            if (Math.abs(a[i] - (n / 2.0)) < Math.abs(r - (n / 2.0))) {
                // Block 7:
                r = a[i];
            }
        }
        // Block 8:
        System.out.println(n + " " + r);
        // Block END.
    }
}
