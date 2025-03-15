class Main {
    public static void main(String[] args) {
        // Block 1:
        int a = 10, b = 0, c = 12, d = 0, e = 120;
        // Block 2:
        int time = (c * 60 + d) - (a * 60 + b);
        // Block 3:
        time = time < 0 ? time + 24 * 60 : time;
        // Block 4:
        System.out.println((60 * c + d) - (60 * a + b) - e);
        // Block END.
    }
}
