class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "internationalization";
        // Block 2:
        System.out.println(String.format("%s%d%s", s.substring(0, 1), (s.length() - 2), s.substring(s.length() - 1)));
        // Block END.
    }
}
