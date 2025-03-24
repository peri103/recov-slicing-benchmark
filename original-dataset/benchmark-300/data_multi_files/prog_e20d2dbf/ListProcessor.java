import java.util.List;

public class ListProcessor {
    private List<Integer> list;

    public ListProcessor(List<Integer> list) {
        this.list = list;
    }

    public int calculateSum() {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
}
