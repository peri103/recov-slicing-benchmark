import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<String> members;

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public void addMember(String member) {
        members.add(member);
    }

    public ArrayList<String> getMembers() {
        return members;
    }

    public String getName() {
        return name;
    }
}
