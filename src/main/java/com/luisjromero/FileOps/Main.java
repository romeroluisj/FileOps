package com.luisjromero.FileOps;

public class Main {
    public static void main(String[] args) {
        AnyFile anyFile = new AnyFile();
        anyFile.setFilename("Hello World!");
        String test = anyFile.getFilename();
        System.out.println(test);
    }
}
