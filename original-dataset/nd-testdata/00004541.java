class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "smiles";
        // Block 2:
        String ans = s.charAt(0) + String.valueOf(s.length() - 2) + s.charAt(s.length() - 1);
        // Block 3:
        System.out.println(ans);
        // Block END.
    }
}
