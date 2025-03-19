class MinimumMoney {
    public long minimumMoney(int[][] ts) {
        int n = ts.length;
        long costtot = 0;
        for (int[] t : ts) {
            if (t[0]>t[1])
                costtot += t[0]-t[1];
        }
        long ans = costtot;
        for (int[] t : ts) {
            if (t[0]>t[1])
                ans = Math.max(ans, costtot+t[1]);
            else
                ans = Math.max(ans, costtot+t[0]);
        }
        return ans;
    }
    public static void main(String[] args) {
        MinimumMoney minimumMoney = new MinimumMoney();
        
        int[][] transactions = {
            {10, 20},
            {20, 30},
            {30, 40},
            {40, 50}
        };
        
        long result = minimumMoney.minimumMoney(transactions);
        
        System.out.println("Minimum money required: " + result);
    }
}