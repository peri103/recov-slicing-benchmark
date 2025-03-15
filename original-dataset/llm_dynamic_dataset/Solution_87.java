class Query {


    private int query(int pos) {
        int ans = 0;
        while (pos >= 1) {
            ans += tree[pos];
            pos -= (pos & (- pos));
        }
        return ans;
    }

    private void update(int pos) {
        while (pos <= 300000) {
            tree[pos] ++;
            pos += (pos & (- pos));
        }
    }

    private int OFFSET = 100000;
    private int[] tree = new int[300010];

    public long numberOfPairs(int[] nums1, int[] nums2, int diff) {
        long ans = 0;
        for (int i = 0;i < nums1.length;i ++) {
            int val = nums1[i] - nums2[i] + OFFSET;
            int expect = val + diff;
            ans += query(expect);
            update(val);
        }
        return ans;
    }
        public static void main(String[] args) {
        Query query = new Query();
        
        int[] nums1 = {3, 1, 4, 1, 5};
        int[] nums2 = {2, 7, 1, 8, 2};
        int diff = 1;
        
        long result = query.numberOfPairs(nums1, nums2, diff);
        
        System.out.println("Number of pairs: " + result);
    }

}