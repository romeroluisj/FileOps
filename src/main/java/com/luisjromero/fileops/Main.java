package com.luisjromero.fileops;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Article article = new Article();
        String filePath = article.getFilePath();
        article.fileToString(filePath);
        String fileContent = article.getStringContent();
        System.out.println(fileContent);
    }
}
