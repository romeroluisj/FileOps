package com.luisjromero.fileops;

public class Main {
    public static void main(String[] args) {
        Article article = new Article();
        String test = article.getExtension();
        int extensionLength = article.getExtensionLength();
        boolean test_bool = article.isHasExtension();
        System.out.println(test);
        System.out.println(extensionLength);
        System.out.println(test_bool);
    }
}
