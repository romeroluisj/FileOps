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
        article.fileContentToWordCountHashMap(filePath);
        article.printWordCountHashMap();
        article.wordCountHashMapToTreeMap(article.getWordCountHashMap());
        article.printWordCountTreeMap();
        System.out.println("firstKey: " + article.getWordCountTreeMap().firstKey());
        System.out.println("lastKey: " + article.getWordCountTreeMap().lastKey());
    }
}
