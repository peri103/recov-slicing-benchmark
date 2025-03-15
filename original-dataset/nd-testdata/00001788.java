class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 10, A = 7, B = 5;
        // Block 2:
        int maximum = Math.min(A, B);
        // Block 3:
        int minimum;
        if (A + B >= N) {
            // Block 4:
            minimum = (A + B) - N;
        // Block 5:
        } else {
            // Block 6:
            minimum = 0;
        }
        // Block 7:
        System.out.println(maximum + " " + minimum);
        // Block END.
    }
}
