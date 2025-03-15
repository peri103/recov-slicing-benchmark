class MinMovesToMakePalindrome {

	public int minMovesToMakePalindrome(String s) {
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(s.length() - 1)) {
				return i + minMovesToMakePalindrome(s.substring(0, i) + s.substring(i + 1, s.length() - 1));
			} else if (s.charAt(s.length() - 1 - i) == s.charAt(0)) {
				return i + minMovesToMakePalindrome(s.substring(1, s.length() - 1 - i) + s.substring(s.length() - i));
			}
		}
		return 0;
	}
	   public static void main(String[] args) {
        MinMovesToMakePalindrome minMovesToMakePalindrome = new MinMovesToMakePalindrome();
        
        String s = "aabb";
        
        int result = minMovesToMakePalindrome.minMovesToMakePalindrome(s);
        
        System.out.println("Minimum moves to make palindrome: " + result);
    }

}