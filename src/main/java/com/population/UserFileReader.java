package com.population;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class UserFileReader {

    public static List<String> readFile(String path) throws IOException {
        if(path == null)    {
            throw new InvalidPathException("path should not be null", "path cannot be null");
        }

        List<String> lines = Files.readAllLines(Paths.get(path), StandardCharsets.ISO_8859_1);

        return lines;

        /*if("../testData/oneLineFile.csv".equals(path))  {
            List<String> lines = new ArrayList<>();
            lines.add("sdfsdfsdfsdfs");
            return lines;
        }
        return Collections.EMPTY_LIST;*/

    }
}
