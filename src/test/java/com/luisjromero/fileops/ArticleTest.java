package com.luisjromero.fileops;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArticleTest {
    private static Article article = null;

    @BeforeAll
    public static void setUp() {
        article = new Article();
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
    public void fileToStringTest() {
        // Given
        String expectedContent = "The dog is not the cat.";
        String filePath = article.getFilePath();

        // When
        article.fileToString(filePath);
        String actualContent = article.getFileToString();

        // Then
        assertEquals(expectedContent, actualContent);
    }

    @Test
    public void getStringContentTest() {
        // Given
        String expectedContent = "test";

        // When
        String actualContent = article.getFileToString();

        // Then
        assertEquals(expectedContent, actualContent);
    }
}
