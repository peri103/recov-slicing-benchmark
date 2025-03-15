class CountMaxOrSubsets {
    public int countMaxOrSubsets(int[] a) {
        int n = a.length;
        int all = 0;
        for(int v : a){
            all |= v;
        }
        int ct = 0;
        for(int i = 0;i < 1<<n;i++){
            int s = 0;
            for(int j = 0;j < n;j++){
                if(i<<~j<0){
                    s |= a[j];
                }
            }
            if(s == all)ct++;
        }
        return ct;
    }
      public static void main(String[] args) {
        int[] a = {3, 1, 2}; // Example input
        CountMaxOrSubsets countMaxOrSubsets = new CountMaxOrSubsets();
        int result = countMaxOrSubsets.countMaxOrSubsets(a);
        System.out.println("Count of maximum OR subsets: " + result);
    }
}