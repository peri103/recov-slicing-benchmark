import com.google.common.collect.ListMultimap;

public class ReportGenerator {
    private DataManager dataManager;

    public ReportGenerator(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    public void generateReport() {
        ListMultimap<String, Integer> multimap = dataManager.getMultimap();
        /* read */ Integer value = multimap.get("key").get(0);
        System.out.println("Report value: " + value);
    }
}
