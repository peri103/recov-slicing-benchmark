class Main {
    public static void main(String[] args) {
        // Block 1:
        String N = "smiles";
        // Block 2:
        int a = N.length();
        // Block 3:
        String ans = N.charAt(0) + Integer.toString(a - 2) + N.charAt(N.length() - 1);
        // Block 4:
        System.out.println(ans);
        // Block END.
    }
}
