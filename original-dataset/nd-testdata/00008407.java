class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 7;
        // Block 2:
        int[] A1 = {3, 3, 4, 5, 4, 5, 3};
        // Block 3:
        int[] A2 = {5, 3, 4, 4, 2, 3, 2};
        // Block 4:
        int[] ans = new int[N];
        // Block 5:
        int i = 0;
        // Block 6:
        while (i < N) {
            // Block 7:
            for (int j = 0; j <= i; j++) {
                ans[i] += A1[j];
            }
            // Block 8:
            for (int j = i; j < N; j++) {
                ans[i] += A2[j];
            }
            // Block 9:
            i++;
        }
        // Block 10:
        int maxAns = ans[0];
        for (int j = 1; j < ans.length; j++) {
            if (ans[j] > maxAns) {
                maxAns = ans[j];
            }
        }
        System.out.println(maxAns);
        // Block END.
    }
}
