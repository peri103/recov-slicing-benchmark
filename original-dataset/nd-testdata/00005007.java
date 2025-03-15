class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "xyz";
        // Block 2:
        int longVar = s.length() - 2;
        // Block 3:
        System.out.println(s.charAt(0) + String.valueOf(longVar) + s.charAt(s.length() - 1));
        // Block END.
    }
}
