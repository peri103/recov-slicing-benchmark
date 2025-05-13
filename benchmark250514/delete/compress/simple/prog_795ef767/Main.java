import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("", 0);
        /* write */ entry.setName("exampleName");
        /* read */ String name = entry.getName();
        System.out.println(name);
    }
}