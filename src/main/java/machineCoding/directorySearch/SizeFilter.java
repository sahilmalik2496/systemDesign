package machineCoding.directorySearch;

public class SizeFilter implements Filter {
    private long minSize;
    private long maxSize;

    public SizeFilter(long minSize, long maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    @Override
    public boolean matches(File file) {
        return file.getSize() >= minSize && file.getSize() <= maxSize;
    }
}
