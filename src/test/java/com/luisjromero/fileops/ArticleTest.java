package com.luisjromero.fileops;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArticleTest {
    private static AnyFile article = null;

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
}
