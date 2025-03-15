import java.util.*;
import java.math.*;

public class SequenceReconstruction {

    public boolean sequenceReconstruction(int[] org, int[][] seqs) {
        Map<Integer, List<Integer>> g = new HashMap<>();
        Map<Integer, Integer> in = new HashMap<>();
        for (int[] seq : seqs)
            for (int i : seq)
                in.putIfAbsent(i, 0);
        for (int[] seq : seqs)
            for (int i = 1; i < seq.length; i++) {
                int u = seq[i - 1], v = seq[i];
                g.putIfAbsent(u, new ArrayList<>());
                g.get(u).add(v);
                in.put(v, in.get(v) + 1);
            }
        if (org.length != in.size()) return false;

        Map<Integer, Integer> dist = new HashMap<>();
        int[] queue = new int[in.size() + 10];
        int head = 0, tail = 0;
        for (int u : in.keySet())
            if (in.get(u) == 0) {
                dist.put(u, 0);
                queue[tail++] = u;
            }
        if (tail > 1) return false;


        List<Integer> topSeq = new ArrayList<>();
        while (head < tail) {
            int u = queue[head++], d = dist.get(u);
            topSeq.add(u);
            if (head < tail && d == dist.get(queue[head])) return false;

            if (g.containsKey(u))
                for (int v : g.get(u)) {
                    in.put(v, in.get(v) - 1);
                    if (in.get(v) == 0) {
                        queue[tail++] = v;
                        dist.put(v, d + 1);
                    }
                }
        }

        if (topSeq.size() != org.length) return false;
        for (int i = 0; i < org.length; i++)
            if (org[i] != topSeq.get(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        SequenceReconstruction sol = new SequenceReconstruction();
//        int[] ori = {1, 2, 3};
//        int[][] seqs = {
//                {1, 2},
//                {2, 3},
//        };
//        int[][] seqs = {
//                {1, 2},
//        };
//        int[][] seqs = {
//                {1, 2},
//                {2, 3},
//                {1, 3},
//        int[][] seqs = {
//                {1, 2},
//                {1, 3},
//        };

       int[] ori = {4, 1, 5, 2, 6, 3};
       int[][] seqs = {
               {5, 2, 6, 3},
               {4, 1, 5, 2},
       };

//        int[] ori = {};
//        int[][] seqs = {
//        };


        System.out.println(sol.sequenceReconstruction(ori, seqs));
    }
}