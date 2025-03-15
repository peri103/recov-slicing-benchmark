class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "smiles";
        // Block 2:
        String n = String.valueOf(s.length() - 2);
        // Block 3:
        System.out.println(s.charAt(0) + n + s.charAt(s.length() - 1));
        // Block END.
    }
}
