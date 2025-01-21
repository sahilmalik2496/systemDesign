package machineCoding.unixFileSearch;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

// Composite filter to combine multiple filters
class CompositeFilter implements FileSearchFilter {
    private final List<FileSearchFilter> filters = new ArrayList<>();

    public void addFilter(FileSearchFilter filter) {
        filters.add(filter);
    }

    @Override
    public boolean matches(File file) {
        for (FileSearchFilter filter : filters) {
            if (!filter.matches(file)) {
                return false;
            }
        }
        return true;
    }
}
