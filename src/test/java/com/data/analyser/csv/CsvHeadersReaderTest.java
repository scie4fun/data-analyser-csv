package com.data.analyser.csv;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.Assert.*;

public class CsvHeadersReaderTest {

    @Test
    public void getHeaders() {

        Path filePath = Paths.get("src/main/resources/test.csv");

        CsvHeadersReader reader= new CsvHeadersReader(filePath);

        List<String> headers = reader.getHeaders();

        System.out.println(String.format("Headers (%d):", headers.size()));
        headers.forEach(header -> System.out.println("\t" + header));

        assertNotNull(headers);
    }
}