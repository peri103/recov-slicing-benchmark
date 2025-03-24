import java.util.ArrayList;

public class DataStorage {
    private ArrayList<Integer> data = new ArrayList<>();

    public void storeData(int value) {
        /* write */ data.add(value);
    }

    public ArrayList<Integer> getData() {
        return data;
    }
}
