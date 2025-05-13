import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class UserEntry {
    private DumpArchiveEntry entry;

    public UserEntry() {
        this.entry = new DumpArchiveEntry();
    }

    public void setUserName(String userName) {
        /* write */ entry.setUserName(userName);
    }

    public String getUserName() {
        return entry.getUserName();
    }

    public void setGroupName(String groupName) {
        entry.setGroupName(groupName);
    }

    public String getGroupName() {
        return entry.getGroupName();
    }
}