class Can {
    public boolean can(int[] weights, int D, int cap) {
        int cd = 0;
        int ans = 1;
        for (int i = 0; i < weights.length; i++) {
            if (cd + weights[i] > cap) {
                ans++;
                cd = 0;
            }
            cd += weights[i];
        }
        return ans <= D;
    }
    public int shipWithinDays(int[] weights, int D) {
        int lo = weights[0], hi = 0;
        for (int i = 0; i < weights.length; i++) {
            lo = Math.max(weights[i], lo);
            hi += weights[i];
        }
        while (lo < hi) {
            int mid = (hi+lo)/2;
            if (can(weights, D, mid)) hi = mid;
            else lo = mid+1;
        }
        return lo;
    }
     public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int D = 5;
        Can canInstance = new Can();
        int result = canInstance.shipWithinDays(weights, D);
        System.out.println("Minimum capacity needed to ship within " + D + " days: " + result);
    }
}