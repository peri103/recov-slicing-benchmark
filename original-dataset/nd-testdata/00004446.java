import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Block 1:
        Scanner scanner = new Scanner(System.in);
        // Block 2:
        String s = "xyz";
        // Block 3:
        System.out.printf("%s%d%s", s.substring(0, 1), s.length() - 2, s.charAt(s.length() - 1));
        // Block END.
    }
}
