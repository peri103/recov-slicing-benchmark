class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 5;
        // Block 2:
        int n = 0;
        // Block 3:
        if (N % 2 == 0) {
            // Block 4:
            int s = 5;
            // Block 5:
            N = N / 2;
            // Block 6:
            while (N >= s) {
                // Block 7:
                n += N / s;
                // Block 8:
                s *= 5;
            }
        }
        // Block 9:
        System.out.println(n);
        // Block END.
    }
}
