import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        ArrayList<String> names = new ArrayList<>();
        HashMap<String, Integer> nameLengths = new HashMap<>();
        
        names.add("developers");
        names.add("administrators");
        names.add("users");
        
        for (String name : names) {
            nameLengths.put(name, name.length());
        }

        String longestName = "";
        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }

        /* write */ entry.setGroupName(longestName);
        
        int totalLength = 0;
        for (String name : names) {
            totalLength += nameLengths.get(name);
        }
        
        double averageLength = totalLength / (double) names.size();
        System.out.println("Average group name length: " + averageLength);
        
        /* read */ String groupName = entry.getGroupName();
        System.out.println("Group name set in entry: " + groupName);
        
        ArrayList<String> descriptions = new ArrayList<>();
        descriptions.add("A group of developers working on various projects.");
        descriptions.add("Administrators responsible for system management.");
        descriptions.add("Users who utilize the system's functionalities.");
        
        for (int i = 0; i < descriptions.size(); i++) {
            System.out.println(descriptions.get(i));
        }
    }
}