class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 3, K = 3;
        // Block 2:
        int[] A = {1, 2, 3};
        // Block 3:
        N -= K;
        // Block 4:
        K -= 1;
        // Block 5:
        int ans = 1;
        // Block 6:
        ans += (N - 1) / K + 1;
        // Block 7:
        System.out.println(ans);
        // Block END.
    }
}
