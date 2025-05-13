import java.util.HashMap;
import java.util.ArrayList;

public class OperatingSystemInfo {
    private HashMap<String, Integer> osMap = new HashMap<>();
    private ArrayList<Integer> osList = new ArrayList<>();

    public OperatingSystemInfo() {
        // Initialize map with some operating system codes
        osMap.put("Windows", 0);
        osMap.put("Unix", 3);
        osMap.put("MacOS", 7);

        // Adding operating system codes to a list
        osList.add(0);
        osList.add(3);
        osList.add(7);
    }

    public int getOsCode(String osName) {
        return osMap.getOrDefault(osName, -1);
    }

    public HashMap<String, Integer> getOsMap() {
        return osMap;
    }

    public ArrayList<Integer> getOsList() {
        return osList;
    }
}
