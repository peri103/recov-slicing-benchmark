class MinimumOneBitOperations {

    public int minimumOneBitOperations(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i *= 2) {
            ans ^= n / i;
        }
        return ans;
    }
      public static void main(String[] args) {
        MinimumOneBitOperations minimumOneBitOperations = new MinimumOneBitOperations();
        
        int n = 3;
        
        int result = minimumOneBitOperations.minimumOneBitOperations(n);
        
        System.out.println("Minimum one bit operations to make " + n + " zero: " + result);
    }
}