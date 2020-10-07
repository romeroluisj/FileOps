package com.luisjromero.fileops;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Article extends AnyFile {
    private String filePath = "";
    private String[] wordArray;
    private Map<String, Integer> wordCountHashMap;
    private TreeMap<String, Integer> wordCountTreeMap;

    public Article() {
        String extension = ".txt";
        super.setExtension(extension);
        super.setExtensionLength(extension.length());
        super.setHasExtension(true);

        String directoryPath = "/Users/luisromero/Dev/FileOps/article/";
        super.setDirectoryPath(directoryPath);
    }

    public Article(String filePath) {
        this.filePath = filePath;
        super.setFilePath(filePath);
    }

    public void fileContentToWordArray(String filePath) {
        this.fileContentToString(filePath);
        this.wordArray = this.getFileContentString().split(" ");
        //System.out.println("wordArray: \n" + Arrays.toString(this.wordArray) + "\n");
    }

    public String[] getFileContenWordArray() {
        return this.wordArray;
    }

    public void fileContentToWordCountHashMap(String filePath) {
        this.fileContentToWordArray(filePath);
        this.wordCountHashMap = new HashMap<String, Integer>();
        for (String word : this.getFileContenWordArray()) {
            word = word.toLowerCase();
            if (!wordCountHashMap.containsKey(word)) {
                wordCountHashMap.put(word, 1);
            } else {
                int count = wordCountHashMap.get(word);
                wordCountHashMap.put(word, count + 1);
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

    public TreeMap<String, Integer> getWordCountTreeMap() {
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
}
