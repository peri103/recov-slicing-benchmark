class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 10, A = 7, B = 5;
        // Block 2:
        int max_ = Math.min(A, B);
        // Block 3:
        int min_ = Math.max(0, (Math.min(A, B) - (N - Math.max(A, B))));
        // Block 4:
        System.out.println(max_ + " " + min_);
        // Block END.
    }
}
