package com.luisjromero.fileops;

import java.util.*;

public class Article extends AnyFile {
    private String filePath = "";
    private String[] wordArray;
    private Map<String, Integer> wordCountHashMap;
    private Map<String, Integer> ascendingWordCount;
    private Map<String, Integer> descendingWordCount;
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
        this.cleanStringForWordCount(super.getFileContentString());
        this.updateWordCount();
        this.sortMapByValue();
    }

    public void stringToWordArray(String string) {
        this.wordArray = string.split(" ");
        //System.out.println("wordArray: \n" + Arrays.toString(this.wordArray) + "\n");
    }

    public String[] getWordArray() {
        return this.wordArray;
    }

    public void stringToWordCountHashMap(String string) {
        this.stringToWordArray(string);
        this.wordCountHashMap = new HashMap<String, Integer>();
        for (String word : this.getWordArray()) {
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
    public Map<String, Integer> getAscendingWordCount() {
        return this.ascendingWordCount;
    }
    public Map<String, Integer> getDescendingWordCount() { return this.descendingWordCount; }

    public void wordCountHashMapToTreeMap(Map<String, Integer> wordCountHashMap) {
        this.wordCountTreeMap = new TreeMap<String, Integer>();
        this.wordCountTreeMap.putAll(wordCountHashMap);
    }

    public SortedMap<String, Integer> getWordCountTreeMap() {
        return this.wordCountTreeMap;
    }

    public void printMapWithForLoop(Map<String, Integer> map) {
        for (String word: map.keySet()){
            int count = map.get(word);
            System.out.println(word + " " + count);
        }
        System.out.println();
    }

    public void printWordCountHashMap() {
        System.out.println("wordCountHashMap:");
        this.printMapWithForLoop(this.wordCountHashMap);
    }

    public void printWordCountTreeMap() {
        System.out.println("wordCountTreeMap:");
        this.printMapWithForLoop(this.wordCountTreeMap);
    }

    public void printAscendingWordCount() {
        System.out.println("ascendingWordCount:");
        this.printMapWithForLoop(this.ascendingWordCount);
    }

    public void printDescendingWordCount() {
        System.out.println("descendingWordCount:");
        this.printMapWithForLoop(this.descendingWordCount);
    }

    public void cleanStringForWordCount(String string) {
        String newlineRegex = "\n+";
        String punctuationRegex = "[.,;:—–\\-!?()\\[\\]“”…/\"\']";
        String multipleSpacesRegex = " +";
        string = string.replaceAll(newlineRegex, " ");
        string = string.replaceAll(punctuationRegex, "");
        string = string.replaceAll(multipleSpacesRegex, " ");
        super.setFileContentString(string);
        //System.out.println(super.getFileContentString());
    }

    public void updateWordCount() {
        this.stringToWordCountHashMap(super.getFileContentString());
        this.wordCountHashMapToTreeMap(this.wordCountHashMap);
    }

    public void sortMapByValue() {
        this.ascendingWordCount = new LinkedHashMap<String, Integer>();
        this.wordCountTreeMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> this.ascendingWordCount.put(x.getKey(), x.getValue()));

        this.descendingWordCount = new LinkedHashMap<String, Integer>();
        this.wordCountTreeMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> this.descendingWordCount.put(x.getKey(), x.getValue()));
    }
}