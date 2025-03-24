import java.util.ArrayList;

public class ArrayListOperations {
    private ArrayList<Integer> arrayList = new ArrayList<>();

    public void add(int value) {
        arrayList.add(value);
    }

    public int sum() {
        int sum = 0;
        for (int num : arrayList) {
            sum += num;
        }
        return sum;
    }
}
