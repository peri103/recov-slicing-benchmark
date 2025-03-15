class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 10, A = 3, B = 5;
        // Block 2:
        int r_max = Math.min(A, B);
        // Block 3:
        int r_min;
        if (A + B > N) {
            // Block 4:
            r_min = A + B - N;
        // Block 5:
        } else {
            // Block 6:
            r_min = 0;
        }
        // Block 7:
        System.out.println(r_max + " " + r_min);
        // Block END.
    }
}
