class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "xyz";
        // Block 2:
        int L = s.length();
        // Block 3:
        int L_a = L - 2;
        // Block 4:
        System.out.println(s.charAt(0) + String.valueOf(L_a) + s.charAt(s.length() - 1));
        // Block END.
    }
}
