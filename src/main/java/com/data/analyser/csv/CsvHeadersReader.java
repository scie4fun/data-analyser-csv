package com.data.analyser.csv;

import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class CsvHeadersReader {

    private Path filePath;

    public CsvHeadersReader(Path filePath) {
        this.filePath = filePath;
    }

    public List<String> getHeaders() {

        CsvParserSettings settings = new CsvParserSettings();
        settings.setMaxColumns(1_000);
        CsvParser parser = new CsvParser(settings);

        File csvFile = filePath.toFile();
        List<String[]> allRows = parser.parseAll(csvFile);

        return Arrays.asList(allRows.get(0));
    }
}
