package com.luisjromero.fileops;
public class AnyFile {
    private String filename = "";
    private String filenameExtension = "";
    private boolean filenameHasExtension = false;
    private boolean fileContainsData = false;

    public AnyFile() {}

    public String getFilename() {return filename;}
    public void setFilename(String filename) {this.filename = filename;}
    public String getFilenameExtension() {return filenameExtension;}
    public void setFilenameExtension(String filenameExtension) {this.filenameExtension = filenameExtension;}
    public boolean isFilenameHasExtension() {return filenameHasExtension;}
    public void setFilenameHasExtension(boolean filenameHasExtension) {this.filenameHasExtension = filenameHasExtension;}
    public boolean isFileContainsData() {return fileContainsData;}
    public void setFileContainsData(boolean fileContainsData) {this.fileContainsData = fileContainsData;}
}