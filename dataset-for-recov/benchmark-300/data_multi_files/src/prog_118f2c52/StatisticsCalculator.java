import java.util.Deque;

public class StatisticsCalculator {
    public int calculateSum(Deque<Integer> queue) {
        int sum = 0;
        for (Integer num : queue) {
            sum += num;
        }
        return sum;
    }

    public int calculateMax(Deque<Integer> queue) {
        int max = Integer.MIN_VALUE;
        for (Integer num : queue) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
