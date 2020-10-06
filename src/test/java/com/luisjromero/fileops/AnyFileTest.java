package com.luisjromero.fileops;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

public class AnyFileTest {
    private static Article anyFile = null;
    private static String filePath = "";

    @BeforeAll
    public static void setUp() {
        filePath = "/Users/luisromero/Dev/FileOps/article/articleTest.txt";
        anyFile = new Article(filePath);
        anyFile.fileContentToString(filePath);
        anyFile.fileContentToWordArray(filePath);
        anyFile.fileContentToWordCountMap(filePath);
    }

    @Test
    public void getNameTest() {
        // Given
        String expectedFilename = "myTest";
        // When
        anyFile.setName(expectedFilename);
        String actualFilename = anyFile.getName();
        // Then
        assertEquals(expectedFilename, actualFilename);
    }

    @Test
    public void fileContentToStringTest() {
        // Given
        String expectedContent = "The dog is not the cat.";
        // When
        String actualContent = anyFile.getFileContentString();
        // Then
        assertEquals(expectedContent, actualContent);
    }
}
