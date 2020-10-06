package com.luisjromero.fileops;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArticleTest {
    private static Article article = null;
    private static String filePath = "";

    @BeforeAll
    public static void setUp() {
        article = new Article();
        filePath = "/Users/luisromero/Dev/FileOps/article/articleTest.txt";
        article.fileContentToString(filePath);
        article.fileContentToWordArray();
    }

    @Test
    public void getFilenameTest() {
        // Given
        String expectedFilename = "myTest";
        // When
        article.setName(expectedFilename);
        String actualFilename = article.getName();
        // Then
        assertEquals(expectedFilename, actualFilename);
    }

    @Test
    public void fileContentToStringTest() {
        // Given
        String expectedContent = "The dog is not the cat.";
        // When
        String actualContent = article.getFileContentString();
        // Then
        assertEquals(expectedContent, actualContent);
    }

    @Test
    public void fileContentAsWordArrayTest() {
        // Given
        String[] expectedArray = {"The", "dog", "is", "not", "the", "cat."};
        // When
        String[] actualArray = article.getFileContenWordArray();
        // Then
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void wordCountTest() {
        // Given
        String expectedContent = "The dog is not the cat.";
        // When
        // Then
    }
}
