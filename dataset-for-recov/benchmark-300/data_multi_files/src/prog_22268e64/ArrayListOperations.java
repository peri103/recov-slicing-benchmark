import java.util.ArrayList;

public class ArrayListOperations {
    private ArrayList<Integer> arrayList = new ArrayList<>();

    public void add(int value) {
        arrayList.add(value);
    }

    public void remove(int index) {
        arrayList.remove(index);
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }
}
