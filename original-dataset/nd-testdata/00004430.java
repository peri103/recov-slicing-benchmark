class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "smiles";
        // Block 2:
        System.out.println(String.format("%s%d%s", s.charAt(0), s.length() - 2, s.charAt(s.length() - 1)));
        // Block END.
    }
}
