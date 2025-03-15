class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "xyz";
        // Block 2:
        char s1 = s.charAt(0);
        // Block 3:
        char s2 = s.charAt(s.length() - 1);
        // Block 4:
        int l = s.substring(1, s.length() - 1).length();
        // Block 5:
        System.out.println(s1 + String.valueOf(l) + s2);
        // Block END.
    }
}
