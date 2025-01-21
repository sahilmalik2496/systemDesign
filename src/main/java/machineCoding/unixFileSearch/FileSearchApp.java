package machineCoding.unixFileSearch;

import java.io.File;
import java.util.List;

public class FileSearchApp {
    public static void main(String[] args) {
        // Define the directory to search
        File directory = new File("/path/to/directory");

        // Create individual filters
        NameFilter nameFilter = new NameFilter("example.txt");
        ExtensionFilter extensionFilter = new ExtensionFilter("java");
        SizeFilter sizeFilter = new SizeFilter(1024); // File size in bytes

        // Combine filters
        CompositeFilter compositeFilter = new CompositeFilter();
        compositeFilter.addFilter(extensionFilter);
        compositeFilter.addFilter(sizeFilter);

        // Search files
        FileSearchEngine searchEngine = new FileSearchEngine();
        List<File> files = searchEngine.search(directory, compositeFilter);

        // Print results
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
