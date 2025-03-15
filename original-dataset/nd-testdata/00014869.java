class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 3, P = 0;
        // Block 2:
        int[] A = {1, 1, 1};
        // Block 3:
        int f = 0;
        // Block 4:
        for (int i = 0; i < N; i++) {
            // Block 5:
            if (A[i] % 2 == 1) {
                // Block 6:
                f = 1;
            }
        }
        // Block 7:
        if (f == 0) {
            // Block 8:
            if (P == 0) {
                // Block 9:
                System.out.println((int) Math.pow(2, N));
            }
            // Block 10:
            else {
                // Block 11:
                System.out.println(0);
            }
        }
        // Block 12:
        else {
            // Block 13:
            System.out.println((int) Math.pow(2, N - 1));
        }
        // Block END.
    }
}
