class NumberOfWays {

	public long numberOfWays(String s) {
		long right[] = new long[s.length()], one = 0, count = 0;
		for (int i = s.length() - 1; i > 0; i--) {
			right[i - 1] = (s.charAt(i) - '0') + right[i];
		}
		for (int i = 0; i < s.length(); i++) {
			count += s.charAt(i) == '0' ? one * right[i] : (i - one) * (s.length() - i - right[i] - 1);
			one += s.charAt(i) - '0';
		}
		return count;
	}
	 public static void main(String[] args) {
        NumberOfWays numberOfWays = new NumberOfWays();
        
        String s = "001101";
        
        long result = numberOfWays.numberOfWays(s);
        
        System.out.println("Number of ways to choose triples: " + result);
    }
}