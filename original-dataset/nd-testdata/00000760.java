import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Block 1:
        Scanner scanner = new Scanner(System.in);
        // Block 2:
        int k = 101;
        // Block 3:
        int num = 7;
        // Block 4:
        int flag = 0;
        // Block 5:
        for (int i = 1; i <= k; i++) {
            // Block 6:
            if (num % k == 0) {
                // Block 7:
                flag = 1;
                // Block 8:
                break;
            }
            // Block 9:
            num = (num * 10 + 7) % k;
        }
        // Block 10:
        if (flag == 1) {
            // Block 11:
            System.out.println(i);
        }
        // Block 12:
        else {
            // Block 13:
            System.out.println(-1);
        }
        // Block END.
    }
}
