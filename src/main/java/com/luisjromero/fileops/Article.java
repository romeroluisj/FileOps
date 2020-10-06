package com.luisjromero.fileops;

import java.util.Arrays;

public class Article extends AnyFile {
    private String filePath = "";
    private String[] wordArray;

    public Article() {
        String extension = ".txt";
        super.setExtension(extension);
        super.setExtensionLength(extension.length());
        super.setHasExtension(true);

        String directoryPath = "/Users/luisromero/Dev/FileOps/article/";
        super.setDirectoryPath(directoryPath);
        this.filePath = "/Users/luisromero/Dev/FileOps/article/articleTest.txt";
        super.setFilePath(filePath);
    }

    public void fileContentToWordArray() {
        this.fileContentToString(this.filePath);
        this.wordArray = this.getFileContentString().split(" ");
        System.out.println(Arrays.toString(this.wordArray));
    }
    public String[] getFileContenWordArray() {
        return this.wordArray;
    }
}
