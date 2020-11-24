package com.luisjromero.fileops;

public class Main {
    static String filePath = "/Users/luisromero/Dev/FileOps/article/SpanishArticle.txt";

    public static void main(String[] args) {
        Article article = new Article(filePath);
        //System.out.println(article.getFileContentString());
        article.printAscendingWordCount();
        article.printDescendingWordCount();
    }
}
