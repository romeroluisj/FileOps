package com.luisjromero.fileops;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Article article = new Article();
        String test = article.getExtension();
        int extensionLength = article.getExtensionLength();
        boolean test_bool = article.isHasExtension();
        System.out.println(test);
        System.out.println(extensionLength);
        System.out.println(test_bool);
        System.out.println(article.getDirectoryPath());

        String filePath = "/Users/luisromero/Dev/FileOps/article/articleTest.txt";
        try {
            // default StandardCharsets.UTF_8
            String content = Files.readString(Paths.get(filePath));
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
