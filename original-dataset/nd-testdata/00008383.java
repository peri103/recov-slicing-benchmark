class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 1;
        // Block 2:
        int[] la1 = {2};
        // Block 3:
        int[] la2 = {3};
        // Block 4:
        int ans = 0;
        // Block 5:
        for (int i = 0; i < n; i++) {
            // Block 6:
            int s1 = 0;
            for (int j = 0; j <= i; j++) {
                s1 += la1[j];
            }
            // Block 7:
            int s2 = 0;
            for (int j = i; j < la2.length; j++) {
                s2 += la2[j];
            }
            // Block 8:
            ans = Math.max(ans, s1 + s2);
        }
        // Block 9:
        System.out.println(ans);
        // Block END.
    }
}
