class KthPalindrome {

	public long[] kthPalindrome(int[] queries, int intLength) {
		long[] result = new long[queries.length];
		for (int i = 0; i < queries.length; i++) {
			String s = (long) Math.pow(10, (intLength - 1) / 2) + queries[i] - 1 + "";
			result[i] = s.length() > (intLength + 1) / 2 ? -1
					: Long.valueOf(s + new StringBuilder(s.substring(0, s.length() - intLength % 2)).reverse());
		}
		return result;
	}
	public static void main(String[] args) {
        KthPalindrome kthPalindrome = new KthPalindrome();
        int[] queries = {1, 2, 3, 4, 5};
        int intLength = 3;
        long[] result = kthPalindrome.kthPalindrome(queries, intLength);
        
        System.out.println("Kth Palindromes:");
        for (long palindrome : result) {
            System.out.println(palindrome);
        }
    }
}