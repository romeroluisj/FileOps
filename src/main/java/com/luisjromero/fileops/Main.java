package com.luisjromero.fileops;

public class Main {
    public static void main(String[] args) {
        /* this works
        superclass = new subclass
        */

        Article article = new Article();
        article.setFilename("Hello World!");
        String test = article.getFilename();
        System.out.println(test);

        /* This doesn't work
        subclass = new superclass

        Article anyFile = new AnyFile();
        anyFile.setFilename("Hello World!");
        String test = anyFile.getFilename();
        System.out.println(test);
         */
    }
}
