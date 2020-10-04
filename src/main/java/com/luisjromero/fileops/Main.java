package com.luisjromero.fileops;

public class Main {
    public static void main(String[] args) {
        /* this works
        superclass = new subclass
        */

        AnyFile anyFile = new Article();
        anyFile.setFilename("Hello World!");
        String test = anyFile.getFilename();
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
