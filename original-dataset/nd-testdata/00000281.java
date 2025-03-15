class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "codefestival";
        // Block 2:
        int k = 100;
        // Block 3:
        String l = "abcdefghijklmnopqrstuvwxyz";
        // Block 4:
        String ans = "";
        // Block 5:
        for (int i = 0; i < s.length() - 1; i++) {
            // Block 6:
            int num = (26 - l.indexOf(s.charAt(i))) % 26;
            // Block 7:
            if (k >= num) {
                // Block 8:
                ans += "a";
                // Block 9:
                k -= num;
            } 
            // Block 10:
            else {
                // Block 11:
                ans += s.charAt(i);
            }
        }
        // Block 12:
        ans += l.charAt((l.indexOf(s.charAt(s.length() - 1)) + k) % 26);
        // Block 13:
        System.out.println(ans);
        // Block END.
    }
}
