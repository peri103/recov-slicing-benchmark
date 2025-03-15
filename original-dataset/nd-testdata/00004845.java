class Main {
    public static void main(String[] args) {
        // Block 1:
        char[] s = {'x', 'y', 'z'};
        // Block 2:
        String ans = s[0] + String.valueOf(s.length - 2) + s[s.length - 1];
        // Block 3:
        System.out.println(ans);
        // Block END.
    }
}
