package com.luisjromero.fileops;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

public class ArticleTest {
    private static Article article = null;
    private static String filePath = "";

    @BeforeAll
    public static void setUp() {
        filePath = "/Users/luisromero/Dev/FileOps/article/articleTest.txt";
        article = new Article(filePath);
        article.fileContentToString(filePath);
        article.fileContentToWordArray(filePath);
        article.fileContentToWordCountMap(filePath);
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
    public void fileContentToWordCountMapTest() {
        // Given
        String expectedContent = "The dog is not the cat.";
        int expectedCountLowercaseThe = 2;
        // When
        Map<String, Integer> wordCountMap = article.getWordCountMap();
        int actualCountLowercaseThe = wordCountMap.get("the");
        // Then
        assertEquals(expectedCountLowercaseThe, actualCountLowercaseThe);
    }
}
