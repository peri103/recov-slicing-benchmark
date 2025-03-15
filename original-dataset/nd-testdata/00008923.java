class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 7;
        // Block 2:
        int[] au = {3, 3, 4, 5, 4, 5, 3};
        // Block 3:
        int[] ad = {5, 3, 4, 4, 2, 3, 2};
        // Block 4:
        int maxi = 0;
        // Block 5:
        for (int i = 0; i < n; i++) {
            // Block 6:
            int sumAu = 0;
            for (int j = 0; j <= i; j++) {
                sumAu += au[j];
            }
            int sumAd = 0;
            for (int j = i; j < n; j++) {
                sumAd += ad[j];
            }
            maxi = Math.max(maxi, sumAu + sumAd);
        }
        // Block 7:
        System.out.println(maxi);
        // Block END.
    }
}
