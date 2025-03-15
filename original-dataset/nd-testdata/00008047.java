class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 3, k = 3;
        // Block 2:
        int[] A = {1, 2, 3};
        // Block 3:
        n -= k;
        // Block 4:
        k -= 1;
        // Block 5:
        int ans = 1;
        // Block 6:
        ans += (n + k - 1) / k;
        // Block 7:
        System.out.println(ans);
        // Block END.
    }
}
