package com.luisjromero.fileops;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Article extends AnyFile {
    private String filePath = "";
    private String[] wordArray;
    private Map<String, Integer> wordCountMap;

    public Article() {
        String extension = ".txt";
        super.setExtension(extension);
        super.setExtensionLength(extension.length());
        super.setHasExtension(true);

        String directoryPath = "/Users/luisromero/Dev/FileOps/article/";
        super.setDirectoryPath(directoryPath);
        this.filePath = "/Users/luisromero/Dev/FileOps/article/SpanishArticle.txt";
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

    public void fileContentToWordCountMap() {
        this.fileContentToWordArray();
        this.wordCountMap = new HashMap<String, Integer>();
        for (String word : this.getFileContenWordArray()) {
            word = word.toLowerCase();
            if (!wordCountMap.containsKey(word)) {  // first time we've seen this string
                wordCountMap.put(word, 1);
            }
            else {
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            }
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return this.wordCountMap;
    }

    public void printWordCountMap() {
        for (String word: this.wordCountMap.keySet()){
            String key = word.toString();
            String value = this.wordCountMap.get(word).toString();
            System.out.println(key + " " + value);
        }
    }
}
