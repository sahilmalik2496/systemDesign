package machineCoding.unixFileSearch;

import java.io.File;

// Concrete filter for extension
class ExtensionFilter implements FileSearchFilter {
    private final String extension;

    public ExtensionFilter(String extension) {
        this.extension = extension;
    }

    @Override
    public boolean matches(File file) {
        return file.getName().endsWith("." + extension);
    }
}
