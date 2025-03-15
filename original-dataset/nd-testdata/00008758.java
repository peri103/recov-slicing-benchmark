class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 7;
        // Block 2:
        int[] a1 = {3, 3, 4, 5, 4, 5, 3};
        // Block 3:
        int[] a2 = {5, 3, 4, 4, 2, 3, 2};
        // Block 4:
        int maxim = 0;
        // Block 5:
        for (int i = 0; i < N; i++) {
            // Block 6:
            int count = 0;
            // Block 7:
            for (int j = 0; j <= i; j++) {
                count += a1[j];
            }
            for (int j = i; j < N; j++) {
                count += a2[j];
            }
            // Block 8:
            if (count > maxim) {
                // Block 9:
                maxim = count;
            }
        }
        // Block 10:
        System.out.println(maxim);
        // Block END.
    }
}
