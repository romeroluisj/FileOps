package com.luisjromero.fileops;

public class Main {
    public static void main(String[] args) {
        Article article = new Article();
        String filePath = article.getFilePath();
        article.fileToString(filePath);
        String fileContent = article.getFileToString();
        System.out.println(fileContent);
    }
}
