package machineCoding.unixFileSearch;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

// File search engine
class FileSearchEngine {
    public List<File> search(File directory, FileSearchFilter filter) {
        List<File> result = new ArrayList<>();
        searchRecursive(directory, filter, result);
        return result;
    }

    private void searchRecursive(File directory, FileSearchFilter filter, List<File> result) {
        if (directory == null || !directory.isDirectory()) {
            return;
        }

        for (File file : directory.listFiles()) {
            if (file.isDirectory()) {
                searchRecursive(file, filter, result);
            } else {
                if (filter.matches(file)) {
                    result.add(file);
                }
            }
        }
    }
}
