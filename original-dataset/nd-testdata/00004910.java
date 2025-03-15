class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "smiles";
        // Block 2:
        char[] ls = s.toCharArray();
        // Block 3:
        System.out.println(ls[0] + String.valueOf(s.length() - 2) + ls[ls.length - 1]);
        // Block END.
    }
}
