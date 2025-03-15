class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "atcoder";
        // Block 2:
        String target = s.substring(0, (s.length() - 1) / 2);
        // Block 3:
        String target2 = s.substring((s.length() + 3) / 2 - 1);
        // Block 4:
        if (target.equals(target2)) {
            // Block 5:
            int l = 0, r = s.length() - 1;
            // Block 6:
            boolean flag = true;
            // Block 7:
            while (l <= r) {
                // Block 8:
                if (s.charAt(l) == s.charAt(r)) {
                    // Block 9:
                    l++;
                    // Block 10:
                    r--;
                }
                // Block 11:
                else {
                    // Block 12:
                    System.out.println("No");
                    // Block 13:
                    System.exit(0);
                }
            }
            // Block 14:
            System.out.println("Yes");
        }
        // Block 15:
        else {
            // Block 16:
            System.out.println("No");
        }
        // Block END.
    }
}
