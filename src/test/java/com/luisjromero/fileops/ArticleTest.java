package com.luisjromero.fileops;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import java.util.TreeMap;

public class ArticleTest {
    private static Article article = null;
    private static String filePath = "";
    private static Map<String, Integer> wordCountHashMap;
    private static TreeMap<String, Integer> wordCountTreeMap;

    @BeforeAll
    public static void setUp() {
        filePath = "/Users/luisromero/Dev/FileOps/article/articleTest.txt";
        article = new Article(filePath);
        article.fileContentToString(filePath);
        article.fileContentToWordArray(filePath);
        article.fileContentToWordCountHashMap(filePath);
        wordCountHashMap = article.getWordCountHashMap();
        article.wordCountHashMapToTreeMap(wordCountHashMap);
        wordCountTreeMap = article.getWordCountTreeMap();
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
    public void fileContentToWordCountHashMapTest() {
        // Given
        String expectedContent = "The dog is not the cat.";
        int expectedCountLowercaseThe = 2;
        // When
        int actualCountLowercaseThe = wordCountHashMap.get("the");
        // Then
        assertEquals(expectedCountLowercaseThe, actualCountLowercaseThe);
    }

    @Test
    public void wordCountHashMapToTreeMapTest() {
        // Given
        String expectedLastKey = "the";
        int expectedLastValue = 2;
        // When
        String actualLastKey = wordCountTreeMap.lastKey();
        int actualLastValue = wordCountTreeMap.get(actualLastKey);
        // Then
        assertEquals(expectedLastKey, actualLastKey);
        assertEquals(expectedLastValue, actualLastValue);
    }
}
