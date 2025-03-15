class Main {
    public static void main(String[] args) {
        // Block 1:
        char[] lit = {'i', 'n', 't', 'e', 'r', 'n', 'a', 't', 'i', 'o', 'n', 'a', 'l', 'i', 'z', 'a', 't', 'i', 'o', 'n'};
        // Block 2:
        int mojisu = lit.length - 2;
        // Block 3:
        String ans = lit[0] + Integer.toString(mojisu) + lit[lit.length - 1];
        // Block 4:
        System.out.println(ans);
        // Block END.
    }
}
