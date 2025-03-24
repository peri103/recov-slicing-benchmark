import java.util.concurrent.CopyOnWriteArrayList;

public class DataWriter {
    private CopyOnWriteArrayList<String> list;

    public DataWriter(CopyOnWriteArrayList<String> list) {
        this.list = list;
    }

    public void writeData(String data) {
        /* write */ list.add(data);
    }
}
