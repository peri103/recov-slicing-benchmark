import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry tarEntry = new TarArchiveEntry("");
        /* write */ tarEntry.setName("example.tar");
        /* read */ String name = tarEntry.getName();
        System.out.println(name);
    }
}