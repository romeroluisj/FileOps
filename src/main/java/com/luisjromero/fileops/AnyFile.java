package com.luisjromero.fileops;
public abstract class AnyFile {
    /**
     * This works:        Superclass superClass = new Subclass();
     * This doesn't work: Subclass subClass = new Superclass();
     */

    private String name = "";
    private String extension = "Abstract AnyFile fileNameExtension";
    private int extensionLength = 0;
    private boolean hasExtension = false;
    private boolean containsData = false;

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
}