package com.luisjromero.fileops;

public class Main {
    public static void main(String[] args) {
        String filePath = "/Users/luisromero/Dev/FileOps/article/SpanishArticle.txt";
        Article article = new Article(filePath);
        System.out.println(article.getFileContentString());

        article.printWordCountTreeMap();
        System.out.println("firstKey: " + article.getWordCountTreeMap().firstKey());
        System.out.println("lastKey: " + article.getWordCountTreeMap().lastKey());
    }
}
