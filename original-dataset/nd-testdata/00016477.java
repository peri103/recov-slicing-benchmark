class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 2;
        // Block 2:
        int[] A = {0, 100};
        // Block 3:
        int ind = -1; // Initialize ind
        for (int i = 0; i < n; i++) {
            // Block 4:
            if (A[i] * 2 > A[A.length - 1]) {
                // Block 5:
                ind = i;
                // Block 6:
                break;
            }
        }
        // Block 7:
        ind -= 1;
        // Block 8:
        int a = A[ind];
        // Block 9:
        int b = A[A.length - 1] - A[ind + 1];
        // Block 10:
        if (a >= b) {
            // Block 11:
            System.out.println(A[A.length - 1] + " " + a);
        // Block 12:
        } else {
            // Block 13:
            System.out.println(A[A.length - 1] + " " + A[ind + 1]);
        }
        // Block END.
    }
}
