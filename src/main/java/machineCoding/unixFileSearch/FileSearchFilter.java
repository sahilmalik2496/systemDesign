package machineCoding.unixFileSearch;

import java.io.File;

// Interface for filters
interface FileSearchFilter {
    boolean matches(File file);
}

// Main class to test the implementation

