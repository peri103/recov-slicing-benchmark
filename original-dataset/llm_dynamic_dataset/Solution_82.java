import java.util.*;

public class NumberOfArithmeticSlices {
    HashMap<String, Integer> check = new HashMap<>();
    
    public int numberOfArithmeticSlices(int[] A) {
        if (A==null || A.length<3) return 0;
        HashMap<Long, List<Integer>> map = new HashMap<>();
        for (int i=0; i<A.length; i++) {
            if (!map.containsKey((long)A[i])) map.put((long)A[i], new ArrayList<Integer>());
            map.get((long)A[i]).add(i);
        }
        int count = 0;
        for (int i=0; i<A.length-2; i++) {
            for (int j=i+1; j<A.length-1; j++) {
                long dif = (long)A[j]-(long)A[i];
                long target = (long)A[j]+dif;
                count += helper(map, j, target, dif);
            }
        }
        return count;
    }
    
    private int helper(HashMap<Long, List<Integer>> map, int thred, long target, long dif) {
        String key = thred+","+target+","+dif;
        if (check.containsKey(key)) return check.get(key);
        if (map.containsKey(target)) {
            List<Integer> list = map.get(target);
            int count = 0;
            for (int each:list) {
                if (each > thred) {
                    count += helper(map, each, target+dif, dif) + 1;
                }
            }
            check.put(key, count);
            return count;
        } else return 0;
    }
       public static void main(String[] args) {
        NumberOfArithmeticSlices numberOfArithmeticSlices = new NumberOfArithmeticSlices();
        
        int[] A = {2, 4, 6, 8, 10};
        
        int result = numberOfArithmeticSlices.numberOfArithmeticSlices(A);
        
        System.out.println("Number of arithmetic slices: " + result);
    }
}