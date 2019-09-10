import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

class RecursiveFileImporter implements Importer {

    private ArrayList<String> paths = new ArrayList<>();

    @Override
    public ArrayList<String> importer(File file) {
        for (File subFile : Objects.requireNonNull(file.listFiles())) {
            if (subFile.isFile()) {
                paths.add(subFile.getPath());
            } else if (subFile.isDirectory()) {
                importer(subFile);
            }
        }
        return paths;
    }
}
