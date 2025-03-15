import java.util.*;
class StrangePrinter {
    int[][][] f;
    public int strangePrinter(String s) {
        int n = s.length();
        if (n==0)
            return 0;
        
        f = new int[n][n][27];
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++)
                Arrays.fill(f[i][j], Integer.MAX_VALUE);
        return calc(s, 0, n-1, 0);
    }
    
    private int calc(String s, int lo, int hi, int color){
        if (f[lo][hi][color] != Integer.MAX_VALUE)
            return f[lo][hi][color];
        
        int res = Integer.MAX_VALUE;
        if (s.charAt(lo) == s.charAt(hi)){
            char c = s.charAt(lo);
            int idx = getIdx(c);
            int start = lo;
            while (s.charAt(start)==c && start<hi)
                start++;
            
            
            if (start==hi){
                if (idx==color)
                    res = 0;
                else
                    res = 1;
            }
            else{
                int end = hi;
                while (s.charAt(end)==c)
                    end--;
                if (color==idx)
                    res = Math.min(res, calc(s, start, end, idx));
                else
                    res = Math.min(res, calc(s, start, end, idx) + 1);
            }
        }
        
        for (int i=lo; i<hi; i++)
            res = Math.min(res, calc(s,lo,i,color) + calc(s,i+1,hi,color));
        
        f[lo][hi][color] = res;
        return res;
    }
    
    private int getIdx(char c){
        return c-'a'+1;
    }
    public static void main(String[] args) {
        StrangePrinter strangePrinter = new StrangePrinter();
        
        String s = "aaabbb";
        
        int result = strangePrinter.strangePrinter(s);
        
        System.out.println("Minimum number of turns the printer needed: " + result);
    }
}