package com.luisjromero.fileops;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import java.util.SortedMap;

public class ArticleTest {
    private static Article article = null;
    private static String filePath = "";
    private static Map<String, Integer> wordCountHashMap;
    private static SortedMap<String, Integer> wordCountTreeMap;

    @BeforeAll
    public static void setUp() {
        filePath = "/Users/luisromero/Dev/FileOps/article/articleTest.txt";
        article = new Article(filePath);
        article.fileContentToString(filePath);
        article.stringToWordArray(article.getFileContentString());
        article.stringToWordCountHashMap(article.getFileContentString());
        wordCountHashMap = article.getWordCountHashMap();
        article.wordCountHashMapToTreeMap(wordCountHashMap);
        wordCountTreeMap = article.getWordCountTreeMap();
    }

    @Test
    public void stringToWordArrayTest() {
        // Given
        String[] expectedArray = {"The", "dog", "is", "not", "the", "cat."};
        // When
        String[] actualArray = article.getFileContentWordArray();
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

    @Test
    public void replaceNewlinesWithSpaceTest() {
        // Given
        String fileContentString = "first\n\n\nlast";
        String expectedModifiedString = "first last";
        // When
        article.setFileContentString(fileContentString);
        article.replaceNewlinesWithSpace(article.getFileContentString());
        String actualModifiedString = article.getFileContentString();
        // Then
        assertEquals(expectedModifiedString, actualModifiedString);
    }
}