class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "smiles";
        // Block 2:
        char f = s.charAt(0);
        // Block 3:
        char e = s.charAt(s.length() - 1);
        // Block 4:
        System.out.println(f + String.valueOf(s.length() - 2) + e);
        // Block END.
    }
}
