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

    @Test
    public void fileContentAsWordArrayTest() {
        // Given
        String[] expectedArray = {"The", "dog", "is", "not", "the", "cat."};
        // When
        String[] actualArray = anyFile.getFileContenWordArray();
        // Then
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void fileContentToWordCountMapTest() {
        // Given
        String expectedContent = "The dog is not the cat.";
        int expectedCountLowercaseThe = 2;
        // When
        Map<String, Integer> wordCountMap = anyFile.getWordCountMap();
        int actualCountLowercaseThe = wordCountMap.get("the");
        // Then
        assertEquals(expectedCountLowercaseThe, actualCountLowercaseThe);
    }
}
