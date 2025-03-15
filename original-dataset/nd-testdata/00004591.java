class Main {
    public static void main(String[] args) {
        // Block 1:
        char[] s = {'i', 'n', 't', 'e', 'r', 'n', 'a', 't', 'i', 'o', 'n', 'a', 'l', 'i', 'z', 'a', 't', 'i', 'o', 'n'};
        // Block 2:
        char first = s[0];
        // Block 3:
        char last = s[s.length - 1];
        // Block 4:
        System.out.println(first + String.valueOf(s.length - 2) + last);
        // Block END.
    }
}
