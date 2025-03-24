import java.util.ArrayList;

public class Processor {
    private DataManager dataManager;

    public Processor(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    public void processData() {
        ArrayList<Integer> data = dataManager.getData();
        /* read */ int value = data.get(0);
        System.out.println("Processed value: " + value);
    }
}
