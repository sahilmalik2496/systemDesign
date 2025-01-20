package machineCoding.directorySearch;

public class NameFilter implements Filter {
    private String keyword;

    public NameFilter(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public boolean matches(File file) {
        return file.getName().contains(keyword);
    }
}