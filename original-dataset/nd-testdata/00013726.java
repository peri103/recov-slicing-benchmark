class Main {
    public static void main(String[] args) {
        // Block 1:
        int H1 = 10, M1 = 0, H2 = 12, M2 = 0, K = 120;
        // Block 2:
        int t1 = 60 * H1 + M1;
        // Block 3:
        int t2 = 60 * H2 + M2;
        // Block 4:
        int t = t2 - K;
        // Block 5:
        int ans = t - t1;
        // Block 6:
        System.out.println(Math.max(0, ans));
        // Block END.
    }
}
