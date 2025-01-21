package machineCoding.downloadManager;

import java.io.*;

public class FileDownloader {
    private String destination;

    public FileDownloader(String destination) {
        this.destination = destination;
    }

    public void saveToFile(byte[] data, long offset) throws IOException {
        RandomAccessFile file = new RandomAccessFile(destination, "rw");
        file.seek(offset);
        file.write(data);
        file.close();
    }
}
