package com.luisjromero.fileops;

public class Main {
    public static void main(String[] args) {
        /**
        String filePath = article.getFilePath();
        article.fileContentToString(filePath);
        String fileContent = article.getFileContentString();
        System.out.println(fileContent);
         */
        String filePath = "/Users/luisromero/Dev/FileOps/article/SpanishArticle.txt";
        Article article = new Article(filePath);
        article.fileContentToWordCountMap(filePath);
        article.printWordCountMap();
    }
}
