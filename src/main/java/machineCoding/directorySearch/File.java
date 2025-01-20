package machineCoding.directorySearch;

public class File {
    private String name;
    private long size;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public long getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "File{name='" + name + "', size=" + size + " bytes}";
    }
}

