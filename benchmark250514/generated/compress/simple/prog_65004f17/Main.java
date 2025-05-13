import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        /* write */ entry.setName("exampleName");
        /* read */ String name = entry.getName();
        System.out.println(name);
    }
}