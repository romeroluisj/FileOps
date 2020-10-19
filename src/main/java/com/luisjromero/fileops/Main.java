package com.luisjromero.fileops;

public class Main {
    public static void main(String[] args) {
        /**
        String filePath = article.getFilePath();
        article.fileContentToString(filePath);
        String fileContent = article.getFileContentString();
        System.out.println(fileContent);
         */
        String filePath = "/Users/luisromero/Dev/FileOps/article/RussianArticle.txt";
        Article article = new Article(filePath);
        System.out.println(article.getFileContentString());

        article.printWordCountTreeMap();
        System.out.println("firstKey: " + article.getWordCountTreeMap().firstKey());
        System.out.println("lastKey: " + article.getWordCountTreeMap().lastKey());
    }
}
