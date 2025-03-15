class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "internationalization";
        // Block 2:
        char fir = s.charAt(0);
        // Block 3:
        char las = s.charAt(s.length() - 1);
        // Block 4:
        s = s.substring(1);
        // Block 5:
        s = s.substring(0, s.length() - 1);
        // Block 6:
        System.out.println(fir + String.valueOf(s.length()) + las);
        // Block END.
    }
}
