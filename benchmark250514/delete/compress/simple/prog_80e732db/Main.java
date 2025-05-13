import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 1000);
        /* write */ entry.setUserName("testUser");
        /* read */ String userName = entry.getUserName();
        System.out.println(userName);
    }
}