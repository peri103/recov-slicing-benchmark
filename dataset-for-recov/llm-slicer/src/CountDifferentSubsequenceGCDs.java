import java.util.*;
class CountDifferentSubsequenceGCDs {
    public int countDifferentSubsequenceGCDs(int[] arr) {
        int N = arr.length;
        int[] buckets = new int[200001];
        for(int x: arr)
        {
            ArrayList<Integer> div = findDiv(x);
            for(int d: div)
            {
                if(buckets[d] == 0)
                    buckets[d] = x;
                else
                    buckets[d] = gcd(buckets[d], x);
            }
        }
        int res = 0;
        for(int i=1; i <= 200000; i++)
            if(buckets[i] == i)
            {
                res++;
            }
        return res;
    }
    public ArrayList<Integer> findDiv(int N)
    {
        //gens all divisors of N
        ArrayList<Integer> ls1 = new ArrayList<Integer>();
        ArrayList<Integer> ls2 = new ArrayList<Integer>();
        for(int i=1; i <= (int)(Math.sqrt(N)+0.00000001); i++)
            if(N%i == 0)
            {
                ls1.add(i);
                ls2.add(N/i);
            }
        Collections.reverse(ls2);
        for(int b: ls2)
            if(b != ls1.get(ls1.size()-1))
                ls1.add(b);
        return ls1;
    }
    public static int gcd(int a, int b)
    {
        if(a > b)
        {
            int t = a;
            a = b;
            b = t;
        }
        if(a == 0)
            return b;
        return gcd(b%a, a);
    }

      public static void main(String[] args) {
        int[] arr = {6, 10, 3}; // Example input
        CountDifferentSubsequenceGCDs countGCDs = new CountDifferentSubsequenceGCDs();
        int result = countGCDs.countDifferentSubsequenceGCDs(arr);
        System.out.println("Count of different subsequence GCDs: " + result);
    }
}