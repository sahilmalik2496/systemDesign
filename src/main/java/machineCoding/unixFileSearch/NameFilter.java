package machineCoding.unixFileSearch;

import java.io.File;

// Concrete filter for name
class NameFilter implements FileSearchFilter {
    private final String name;

    public NameFilter(String name) {
        this.name = name;
    }

    @Override
    public boolean matches(File file) {
        return file.getName().equals(name);
    }
}
