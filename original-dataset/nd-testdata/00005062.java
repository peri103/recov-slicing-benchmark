class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "internationalization";
        // Block 2:
        char first = s.charAt(0);
        // Block 3:
        char end = s.charAt(s.length() - 1);
        // Block 4:
        System.out.println(first + String.valueOf(s.length() - 2) + end);
        // Block END.
    }
}
