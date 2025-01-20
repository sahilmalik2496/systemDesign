package machineCoding.directorySearch;

import java.util.ArrayList;
import java.util.List;

public class DirectorySearcher {
    private List<File> files;

    public DirectorySearcher(List<File> files) {
        this.files = files;
    }

    public List<File> search(Filter filter) {
        List<File> result = new ArrayList<>();
        for (File file : files) {
            if (filter.matches(file)) {
                result.add(file);
            }
        }
        return result;
    }
}