package com.luisjromero.fileops;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class AnyFile {
    /**
     * This works:        Superclass superClass = new Subclass();
     * This doesn't work: Subclass subClass = new Superclass();
     */

    private String name = "";
    private String extension = "";
    private int extensionLength = 0;
    private boolean hasExtension = false;
    private boolean containsData = false;
    private String filePath = "";
    private String directoryPath = "";
    private String fileContent = "test";

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getExtension() {return extension;}
    public void setExtension(String extension) {this.extension = extension;}
    public int getExtensionLength() {return extensionLength;}
    public void setExtensionLength(int extensionLength) {this.extensionLength = extensionLength; }
    public boolean isHasExtension() {return hasExtension;}
    public void setHasExtension(boolean hasExtension) {this.hasExtension = hasExtension;}
    public boolean isContainsData() {return containsData;}
    public void setContainsData(boolean containsData) {this.containsData = containsData;}
    public String getFilePath() {return filePath;}
    public void setFilePath(String filePath) {this.filePath = filePath;}
    public String getDirectoryPath() {return directoryPath; }
    public void setDirectoryPath(String directoryPath) {this.directoryPath = directoryPath;}

    public void fileToString(String filePath) {
        try {
            this.fileContent = Files.readString(Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getStringContent() {
        return this.fileContent;
    }
}