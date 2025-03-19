import java.util.*;

public class CanTraverseAllPairs {
    public boolean canTraverseAllPairs(int[] arr) {
        int N = arr.length;
        boolean[] has = new boolean[1<<17];
        int MAX = 100000;
        for(int x: arr)
            has[x] = true;
        if(N == 1)
            return true;
        if(has[1])
            return false;
        DSU union = new DSU(2*MAX+1);
        for(int d=2; d <= MAX; d++)
        {
            int root = d+MAX;
            for(int v=d; v <= MAX; v+=d)
                if(has[v])
                    union.merge(root, v);
        }
        HashSet<Integer> comps = new HashSet<Integer>();
        for(int i=2; i <= MAX; i++)
            if(has[i])
                comps.add(union.find(i));
        return comps.size() == 1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 12, 18};
        CanTraverseAllPairs canTraverseAllPairs = new CanTraverseAllPairs();
        boolean result = canTraverseAllPairs.canTraverseAllPairs(arr);
        System.out.println("Can traverse all pairs: " + result);
    }
}
class DSU
{
    public int[] dsu;

    public DSU(int N)
    {
        dsu = new int[N+1];
        for(int i=0; i <= N; i++)
        {
            dsu[i] = i;
        }
    }
    //with path compression, no find by rank
    public int find(int x)
    {
        return dsu[x] == x ? x : (dsu[x] = find(dsu[x]));
    }
    public void merge(int x, int y)
    {
        int fx = find(x);
        int fy = find(y);
        if(fx == fy)
            return;
        dsu[fx] = fy;
    }
}