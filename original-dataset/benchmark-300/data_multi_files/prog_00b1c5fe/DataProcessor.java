import java.util.ArrayList;
import java.util.LinkedList;

public class DataProcessor {
    private ArrayList<Integer> processedList = new ArrayList<>();
    private LinkedList<String> processedLinkedList = new LinkedList<>();

    public void processData(int[] numbers) {
        for (int num : numbers) {
            processedList.add(num * 2);
        }
    }

    public void processData(String[] strings) {
        for (String str : strings) {
            processedLinkedList.add(str.toUpperCase());
        }
    }

    public ArrayList<Integer> getProcessedList() {
        return processedList;
    }

    public LinkedList<String> getProcessedLinkedList() {
        return processedLinkedList;
    }
}
