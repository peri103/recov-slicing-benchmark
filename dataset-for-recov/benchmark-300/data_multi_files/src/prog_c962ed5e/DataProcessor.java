import java.util.HashSet;
import java.util.Iterator;

public class DataProcessor {
    private HashSet<String> hashSet = new HashSet<>();

    public void addInitialData() {
        hashSet.add("initialValue1");
        hashSet.add("initialValue2");
    }

    public void processData(DataStore dataStore) {
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            dataStore.addData(iterator.next());
        }
    }

    public void addUnrelatedData() {
        for (int i = 0; i < 5; i++) {
            hashSet.add("unrelatedValue" + i);
        }
    }

    public HashSet<String> getHashSet() {
        return hashSet;
    }
}
