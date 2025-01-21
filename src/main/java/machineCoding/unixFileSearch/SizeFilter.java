package machineCoding.unixFileSearch;

import java.io.File;

// Concrete filter for size
class SizeFilter implements FileSearchFilter {
    private final long size;

    public SizeFilter(long size) {
        this.size = size;
    }

    @Override
    public boolean matches(File file) {
        return file.length() == size;
    }
}
