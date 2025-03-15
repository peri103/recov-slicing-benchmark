class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 45, P = 1;
        // Block 2:
        int[] A = {17, 55, 85, 55, 74, 20, 90, 67, 40, 70, 39, 89, 91, 50, 16, 24, 14, 43, 24, 66, 25, 9, 89, 71, 41, 16, 53, 13, 61, 15, 85, 72, 62, 67, 42, 26, 36, 66, 4, 87, 59, 91, 4, 25, 26};
        // Block 3:
        boolean odd = false;
        // Block 4:
        for (int i = 0; i < N; i++) {
            // Block 5:
            if (A[i] % 2 == 1) {
                // Block 6:
                odd = true;
                // Block 7:
                break;
            }
        }
        // Block 8:
        if (odd) {
            // Block 9:
            System.out.println((int)Math.pow(2, N - 1));
        }
        // Block 10:
        else {
            // Block 11:
            if (P == 0) {
                // Block 12:
                System.out.println((int)Math.pow(2, N));
            }
            // Block 13:
            else {
                // Block 14:
                System.out.println(0);
            }
        }
        // Block END.
    }
}
