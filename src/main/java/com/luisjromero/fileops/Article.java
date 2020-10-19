package com.luisjromero.fileops;

import java.util.Map;
import java.util.SortedMap;
import java.util.HashMap;
import java.util.TreeMap;

public class Article extends AnyFile {
    private String filePath = "";
    private String[] wordArray;
    private Map<String, Integer> wordCountHashMap;
    private SortedMap<String, Integer> wordCountTreeMap;

    public Article() {
        String extension = ".txt";
        super.setExtension(extension);
        super.setExtensionLength(extension.length());
        super.setHasExtension(true);

        String directoryPath = "/Users/luisromero/Dev/FileOps/article/";
        super.setDirectoryPath(directoryPath);
    }

    public Article(String filePath) {
        super.setFilePath(filePath);
        super.fileContentToString(filePath);
        this.replaceNewlinesWithSpace(super.getFileContentString());
    }

    public void stringToWordArray(String string) {
        this.wordArray = string.split(" ");
        //System.out.println("wordArray: \n" + Arrays.toString(this.wordArray) + "\n");
    }

    public String[] getFileContentWordArray() {
        return this.wordArray;
    }

    public void stringToWordCountHashMap(String string) {
        this.stringToWordArray(string);
        this.wordCountHashMap = new HashMap<String, Integer>();
        for (String word : this.getFileContentWordArray()) {
            word = word.toLowerCase();
            if (!this.wordCountHashMap.containsKey(word)) {
                this.wordCountHashMap.put(word, 1);
            } else {
                int count = this.wordCountHashMap.get(word);
                this.wordCountHashMap.put(word, count + 1);
            }
        }
    }

    public Map<String, Integer> getWordCountHashMap() {
        return this.wordCountHashMap;
    }

    public void wordCountHashMapToTreeMap(Map<String, Integer> wordCountHashMap) {
        this.wordCountTreeMap = new TreeMap<String, Integer>();
        this.wordCountTreeMap.putAll(wordCountHashMap);
    }

    public SortedMap<String, Integer> getWordCountTreeMap() {
        return this.wordCountTreeMap;
    }

    public void printWordCountHashMap() {
        System.out.println("wordCountHashMap:");
        for (String word: this.wordCountHashMap.keySet()){
            String key = word.toString();
            String value = this.wordCountHashMap.get(word).toString();
            System.out.println(key + " " + value);
        }
        System.out.println();
    }

    public void printWordCountTreeMap() {
        System.out.println("wordCountTreeMap:");
        for (String word: this.wordCountTreeMap.keySet()){
            String key = word.toString();
            String value = this.wordCountTreeMap.get(word).toString();
            System.out.println(key + " " + value);
        }
        System.out.println();
    }

    public void replaceNewlinesWithSpace(String string) {
        String newString = string.replaceAll("\n+", " ");
        super.setFileContentString(newString);
        this.updateWordCount();
        //System.out.println(super.getFileContentString());
    }

    public void updateWordCount() {
        this.stringToWordCountHashMap(super.getFileContentString());
        this.wordCountHashMapToTreeMap(this.wordCountHashMap);
    }
}