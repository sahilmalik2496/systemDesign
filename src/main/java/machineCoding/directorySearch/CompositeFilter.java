package machineCoding.directorySearch;


import java.util.List;

public class CompositeFilter implements Filter {
    private List<Filter> filters;

    public CompositeFilter(List<Filter> filters) {
        this.filters = filters;
    }

    @Override
    public boolean matches(File file) {
        for (Filter filter : filters) {
            if (!filter.matches(file)) {
                return false;
            }
        }
        return true;
    }
}
