import java.util.ArrayList;

public class ArrayListManager {
    private ArrayList<Double> arrayList = new ArrayList<>();

    public void addToList(Double value) {
        arrayList.add(value);
    }

    public void printList() {
        for (Double d : arrayList) {
            System.out.println(d);
        }
    }
}
