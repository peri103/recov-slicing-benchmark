class Main {
    public static void main(String[] args) {
        // Block 1:
        char[] s = {'x', 'y', 'z'};
        // Block 2:
        String y = String.valueOf(s.length - 2);
        // Block 3:
        System.out.println(s[0] + y + s[s.length - 1]);
        // Block END.
    }
}
