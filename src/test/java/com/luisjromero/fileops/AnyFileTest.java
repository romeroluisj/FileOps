package com.luisjromero.fileops;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnyFileTest {
    private static AnyFile anyFile = null;

    @BeforeAll
    public static void setUp() {
        anyFile = new AnyFile();
    }

    @Test
    public void getFilenameTest() {
        // Given
        String expectedFilename = "myTest";

        // When
        anyFile.setFilename(expectedFilename);
        String actualFilename = anyFile.getFilename();

        // Then
        assertEquals(expectedFilename, actualFilename);
    }
}
