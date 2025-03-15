class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 10, a = 7, b = 5;
        // Block 2:
        int max_r = Math.min(a, b);
        // Block 3:
        int min_r = Math.max(0, (a + b) - n);
        // Block 4:
        System.out.println(String.format("%d %d", max_r, min_r));
        // Block END.
    }
}
