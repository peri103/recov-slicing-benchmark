import java.util.*;
class MinRemoveToMakeValid {
    public String minRemoveToMakeValid(String s) {
        final int N = s.length();
        Stack<Integer> open = new Stack<>();
        char[] A = s.toCharArray();
        for (int i = 0; i < N; ++i) {
            if (A[i] == '(') {
                open.push(i);
            } else if (A[i] == ')') {
                if (open.isEmpty()) {
                    A[i] = '#';
                } else {
                    open.pop();
                }
            }
        }
        while (!open.isEmpty()) {
            int idx = open.pop();
            A[idx] = '#';
        }
        StringBuilder sb = new StringBuilder();
        for (char c : A) {
            if (c != '#') {
                sb.append(c);
            }
        }
        return sb.toString();
    }
       public static void main(String[] args) {
        MinRemoveToMakeValid minRemoveToMakeValid = new MinRemoveToMakeValid();
        
        String s = "lee(t(c)o)de)";
        
        String result = minRemoveToMakeValid.minRemoveToMakeValid(s);
        
        System.out.println("String after removing invalid parentheses: " + result);
    }
}