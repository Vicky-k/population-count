package com.population;

import org.junit.Test;

import java.nio.file.InvalidPathException;
import java.util.List;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NewFileTest {
    @Test(expected = InvalidPathException.class)
    public void throwsExceptionWhenFileNotPresent() throws Exception {

        UserFileReader.readFile(null);

    }

    @Test
    public void returnZeroWhenEmptyFile()  throws Exception {
        List<String> lines = UserFileReader.readFile("src/test/java/com/testData/emptyfile.csv");

        assertTrue(lines.isEmpty());
    }

    @Test
    public void returnOneWhenOneLineInFile() throws Exception {
        List<String> lines = UserFileReader.readFile("src/test/java/com/testData/oneLineFile.csv");

        assertEquals(1, lines.size());
    }


}
