class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 100, A = 100, B = 100;
        // Block 2:
        int MAX = Math.min(A, B);
        // Block 3:
        int MIN = Math.max(0, A + B - N);
        // Block 4:
        System.out.println(MAX + " " + MIN);
        // Block END.
    }
}
