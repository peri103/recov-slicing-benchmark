class Main {
    public static void main(String[] args) {
        // Block 1:
        String S = "smiles";
        // Block 2:
        String ans = S.charAt(0) + String.valueOf(S.length() - 2) + S.charAt(S.length() - 1);
        // Block 3:
        System.out.println(ans);
        // Block END.
    }
}
