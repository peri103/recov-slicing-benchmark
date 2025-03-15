class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "xyz";
        // Block 2:
        int n = s.substring(1, s.length() - 1).length();
        // Block 3:
        System.out.println(s.charAt(0) + String.valueOf(n) + s.charAt(s.length() - 1));
        // Block END.
    }
}
