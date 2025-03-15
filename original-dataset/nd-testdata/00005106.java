class Main {
    public static void main(String[] args) {
        // Block 1:
        String s = "xyz";
        // Block 2:
        char first_letter = s.charAt(0);
        // Block 3:
        char last_letter = s.charAt(s.length() - 1);
        // Block 4:
        String number = String.valueOf(s.length() - 2);
        // Block 5:
        System.out.println(first_letter + number + last_letter);
        // Block END.
    }
}
