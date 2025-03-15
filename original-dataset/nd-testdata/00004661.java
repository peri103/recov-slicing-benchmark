class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "smiles";
        // Block 2:
        int char_number = s.length();
        // Block 3:
        char start = s.charAt(0);
        // Block 4:
        char end = s.charAt(s.length() - 1);
        // Block 5:
        String answer = start + Integer.toString(char_number - 2) + end;
        // Block 6:
        System.out.println(answer);
        // Block END.
    }
}
