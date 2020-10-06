package com.luisjromero.fileops;

public class Main {
    public static void main(String[] args) {
        Article article = new Article();
        String filePath = article.getFilePath();
        article.fileContentToString(filePath);
        String fileContent = article.getFileContentString();
        System.out.println(fileContent);
    }
}
