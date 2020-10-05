package com.luisjromero.fileops;

public class Article extends AnyFile {

    public Article() {
        String extension = ".txt";
        super.setExtension(extension);
        super.setExtensionLength(extension.length());
        super.setHasExtension(true);

        String directoryPath = "/Users/luisromero/Dev/FileOps/article/";
        super.setDirectoryPath(directoryPath);
        String filePath = "/Users/luisromero/Dev/FileOps/article/articleTest.txt";
        super.setFilePath(filePath);
    }
}
