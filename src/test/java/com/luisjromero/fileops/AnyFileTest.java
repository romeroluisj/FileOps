package com.luisjromero.fileops;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnyFileTest {
    private static Article anyFile = null;
    private static String filePath = "";

    @BeforeAll
    public static void setUp() {
        filePath = "/Users/luisromero/Dev/FileOps/article/articleTest.txt";
        anyFile = new Article(filePath);
        anyFile.fileContentToString(filePath);
        anyFile.stringToWordArray(filePath);
        anyFile.stringToWordCountHashMap(filePath);
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
        this.anyFile.fileContentToString(this.filePath);
        // When
        String actualContent = this.anyFile.getFileContentString();
        // Then
        assertEquals(expectedContent, actualContent);
    }

    @Test
    public void setFileContentStringTest() {
        // Given
        String expectedFileContentString = "test_a_test";
        // When
        anyFile.setFileContentString(expectedFileContentString);
        String actualFileContentString = anyFile.getFileContentString();
        // Then
        assertEquals(expectedFileContentString, actualFileContentString);
    }
}
