import java.util.ArrayList;
import java.util.List;

public class ComplexListProcessor {
    private List<String> stringList;

    public ComplexListProcessor() {
        this.stringList = new ArrayList<>();
    }

    public void addStrings() {
        stringList.add("First");
        stringList.add("Second");
        stringList.add("Third");
    }

    public void processList() {
        for (String str : stringList) {
            System.out.println("Processing: " + str);
        }
    }

    public void modifyList() {
        stringList.add("Fourth");
        stringList.remove(1); // Remove "Second"
        for (int i = 0; i < stringList.size(); i++) {
            stringList.set(i, stringList.get(i).toUpperCase());
        }
    }

    public List<String> getStringList() {
        return stringList;
    }
}
