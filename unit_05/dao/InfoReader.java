package dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InfoReader implements AutoCloseable {
    BufferedReader reader;

    public InfoReader(String path) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(path));
    }

    public String readNote() throws IOException {
        String line = reader.readLine();

        if (line != null) {
            return line;
        }

        return null;
    }

    @Override
    public void close() throws IOException {
        reader.close();
    }
}