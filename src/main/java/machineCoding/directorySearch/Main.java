package machineCoding.directorySearch;

import java.util.ArrayList;
import java.util.List;

/*
Design an extensible solution to implement a search filter in OOD for a directory, matching files by size or name.


 */

public class Main {
    public static void main(String[] args) {
        // Mock file data
        List<File> files = new ArrayList<>();
        files.add(new File("document.txt", 1200));
        files.add(new File("photo.jpg", 200000));
        files.add(new File("report.pdf", 800));
        files.add(new File("presentation.pptx", 3000));

        DirectorySearcher searcher = new DirectorySearcher(files);

        // Search for files with "doc" in their name
        Filter nameFilter = new NameFilter("doc");
        List<File> nameResults = searcher.search(nameFilter);
        System.out.println("Files matching 'doc': " + nameResults);

        // Search for files within a size range
        Filter sizeFilter = new SizeFilter(1000, 5000);
        List<File> sizeResults = searcher.search(sizeFilter);
        System.out.println("Files matching size filter: " + sizeResults);

        // Search for files with "photo" in the name AND size > 1000 bytes
        List<Filter> compositeFilters = new ArrayList<>();
        compositeFilters.add(new NameFilter("photo"));
        compositeFilters.add(new SizeFilter(1000, Long.MAX_VALUE));
        Filter compositeFilter = new CompositeFilter(compositeFilters);
        List<File> compositeResults = searcher.search(compositeFilter);
        System.out.println("Files matching composite filter: " + compositeResults);
    }
}
