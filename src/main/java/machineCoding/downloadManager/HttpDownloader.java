package machineCoding.downloadManager;

import java.io.*;
import java.net.*;

public class HttpDownloader {
    private String url;
    private long startByte;

    public HttpDownloader(String url, long startByte) {
        this.url = url;
        this.startByte = startByte;
    }

    public byte[] downloadChunk() throws IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestProperty("Range", "bytes=" + startByte + "-");
        connection.connect();

        InputStream inputStream = connection.getInputStream();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        byte[] buffer = new byte[4096];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }

        return outputStream.toByteArray();
    }
}

