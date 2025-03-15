class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 2;
        // Block 2:
        int[] a = {100, 0};
        // Block 3:
        int m = Integer.MIN_VALUE;
        for (int num : a) {
            if (num > m) {
                m = num;
            }
        }
        // Block 4:
        double res = 1e10;
        // Block 5:
        int ans = 0;
        // Block 6:
        for (int i : a) {
            // Block 7:
            if (i != m) {
                // Block 8:
                if (Math.abs(m / 2 - i) < res) {
                    // Block 9:
                    res = Math.abs(m / 2 - i);
                    // Block 10:
                    ans = i;
                }
            }
        }
        // Block 11:
        System.out.println(m + " " + ans);
        // Block END.
    }
}
