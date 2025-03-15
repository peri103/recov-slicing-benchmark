class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "smiles";
        // Block 2:
        int l = s.length() - 2;
        // Block 3:
        String i = s.charAt(0) + Integer.toString(l) + s.charAt(s.length() - 1);
        // Block 4:
        System.out.println(i);
        // Block END.
    }
}
