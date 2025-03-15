class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "xyz";
        // Block 2:
        int l = s.length();
        // Block 3:
        System.out.println(s.charAt(0) + String.valueOf(l - 2) + s.charAt(l - 1));
        // Block END.
    }
}
