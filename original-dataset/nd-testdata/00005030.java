class Main {
    public static void main(String[] args) {
        // Block 1:
        char[] word = {'s', 'm', 'i', 'l', 'e', 's'};
        // Block 2:
        StringBuilder rep_word = new StringBuilder();
        // Block 3:
        int num_abb = word.length - 2;
        // Block 4:
        rep_word.append(word[0]);
        // Block 5:
        rep_word.append(num_abb);
        // Block 6:
        rep_word.append(word[word.length - 1]);
        // Block 7:
        System.out.println(rep_word.toString());
        // Block END.
    }
}
