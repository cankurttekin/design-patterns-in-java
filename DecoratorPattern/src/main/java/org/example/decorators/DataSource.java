package org.example.decorators;

public interface DataSource {
    void writeData(String data);
    String readData();
}
