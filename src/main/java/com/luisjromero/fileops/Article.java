package com.luisjromero.fileops;

public class Article extends AnyFile {

    public Article() {
        String extension = ".txt";
        super.setExtension(extension);
        super.setExtensionLength(extension.length());
        super.setHasExtension(true);
    }
}
