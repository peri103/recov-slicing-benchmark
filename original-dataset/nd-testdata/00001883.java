class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 10, a = 7, b = 5;
        // Block 2:
        int[] ans = {0, 0};
        // Block 3:
        ans[0] = Math.min(a, b);
        // Block 4:
        ans[1] = Math.max(0, a + b - n);
        // Block 5:
        System.out.println(ans[0] + " " + ans[1]);
        // Block END.
    }
}
