class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 10, a = 3, b = 5;
        // Block 2:
        int max_ = Math.min(a, b);
        // Block 3:
        int min_ = Math.max(a + b - n, 0);
        // Block 4:
        System.out.println(max_ + " " + min_);
        // Block END.
    }
}
