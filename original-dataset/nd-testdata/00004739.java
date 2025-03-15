class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "smiles";
        // Block 2:
        int k = s.length() - 2;
        // Block 3:
        System.out.println(String.format("%s%d%s", s.charAt(0), k, s.charAt(s.length() - 1)));
        // Block END.
    }
}
