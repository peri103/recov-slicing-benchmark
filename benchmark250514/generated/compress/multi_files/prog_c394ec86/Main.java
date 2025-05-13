import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GroupManager groupManager = new GroupManager("example.txt");
        Team developersTeam = new Team("Developers");
        
        developersTeam.addMember("Alice");
        developersTeam.addMember("Bob");
        developersTeam.addMember("Charlie");
        
        ArrayList<String> memberNames = developersTeam.getMembers();
        
        String longestName = "";
        for (String name : memberNames) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }

        groupManager.setGroupName(longestName);
        
        int totalLength = 0;
        for (String name : memberNames) {
            totalLength += name.length();
        }
        
        double averageLength = totalLength / (double) memberNames.size();
        System.out.println("Average member name length: " + averageLength);
        
        /* read */ String groupName = groupManager.getGroupName();
        System.out.println("Group name set in entry: " + groupName);
        
        ArrayList<String> descriptions = new ArrayList<>();
        descriptions.add("A team of developers working on various projects.");
        descriptions.add("A dynamic team focused on innovation.");
        
        for (String description : descriptions) {
            System.out.println(description);
        }
    }
}