class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 10, a = 3, b = 5;
        // Block 2:
        int ans1 = Math.min(a, b);
        // Block 3:
        int ans2 = Math.max(0, a + b - n);
        // Block 4:
        System.out.printf("%d %d%n", ans1, ans2);
        // Block END.
    }
}
