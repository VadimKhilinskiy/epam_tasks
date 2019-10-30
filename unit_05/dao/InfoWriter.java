package dao;

import java.io.FileWriter;
import java.io.IOException;

public class InfoWriter implements AutoCloseable {
    FileWriter writer;

    public InfoWriter(String path) throws IOException {
            writer = new FileWriter(path, true);
        }

        public void writeNote(String note) throws IOException {
            writer.write(note + '\n');
            writer.flush();
        }

        @Override
        public void close() throws IOException {
            writer.close();
        }
}
