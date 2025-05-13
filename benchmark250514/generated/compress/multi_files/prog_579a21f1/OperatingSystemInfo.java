import java.util.HashMap;

public class OperatingSystemInfo {
    private HashMap<Integer, String> osNames = new HashMap<>();

    public OperatingSystemInfo() {
        osNames.put(1, "Windows");
        osNames.put(2, "Linux");
        osNames.put(3, "MacOS");
        osNames.put(4, "Unix");
    }

    public String getOSName(int osCode) {
        return osNames.getOrDefault(osCode, "Unknown");
    }
}
