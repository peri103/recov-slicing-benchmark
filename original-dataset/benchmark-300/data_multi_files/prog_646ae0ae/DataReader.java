import java.util.concurrent.CopyOnWriteArrayList;

public class DataReader {
    private CopyOnWriteArrayList<String> list;

    public DataReader(CopyOnWriteArrayList<String> list) {
        this.list = list;
    }

    public String readData() {
        /* read */ return list.get(0);
    }
}
