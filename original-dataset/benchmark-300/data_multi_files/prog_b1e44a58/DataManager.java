import java.util.ArrayList;

public class DataManager {
    private ArrayList<Integer> data = new ArrayList<>();

    public void addData(int value) {
        /* write */ data.add(value);
    }

    public ArrayList<Integer> getData() {
        return data;
    }
}
