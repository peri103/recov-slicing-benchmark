class Main {
    public static void main(String[] args) {
        // Block 1:
        int H = 14;
        // Block 2:
        int W = 12;
        // Block 3:
        int N = 112;
        // Block 4:
        int A = Math.max(H, W);
        // Block 5:
        int ans = (N + A - 1) / A;
        // Block 6:
        System.out.println(ans);
        // Block END.
    }
}
