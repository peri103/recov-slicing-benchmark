import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;
import java.util.Date;

public class ArchiveManager {
    private ArrayList<TarArchiveHandler> archiveHandlers = new ArrayList<>();

    public void addArchive(String fileName, Date modTime) {
        TarArchiveHandler handler = new TarArchiveHandler(fileName);
        handler.setModificationTime(modTime);
        archiveHandlers.add(handler);
    }

    public ArrayList<TarArchiveHandler> getArchiveHandlers() {
        return archiveHandlers;
    }
}
