import java.util.Vector;

public class Processor {
    private DataContainer container;

    public Processor(DataContainer container) {
        this.container = container;
    }

    public void processData() {
        Vector<Integer> data = container.getData();
        /* read */ int value = data.elementAt(0);
        System.out.println("Processed value: " + value);
    }
}
