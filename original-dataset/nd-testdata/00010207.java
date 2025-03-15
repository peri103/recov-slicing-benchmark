import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // Block 1:
        int N = 8;
        // Block 2:
        String S = "))))((((";
        // Block 3:
        int[] SS = new int[N];
        for (int i = 0; i < N; i++) {
            SS[i] = (S.charAt(i) == '(') ? 1 : -1;
        }
        // Block 4:
        ArrayList<Integer> SSS = new ArrayList<>();
        int sum = 0;
        for (int value : SS) {
            sum += value;
            SSS.add(sum);
        }
        // Block 5:
        int m = Math.max(0, -SSS.stream().min(Integer::compare).orElse(0));
        // Block 6:
        int M = SSS.get(SSS.size() - 1);
        // Block 7:
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < m; i++) {
            result.append('(');
        }
        result.append(S);
        for (int i = 0; i < (M + m); i++) {
            result.append(')');
        }
        // Block 8:
        System.out.println(result);
        // Block END.
    }
}
