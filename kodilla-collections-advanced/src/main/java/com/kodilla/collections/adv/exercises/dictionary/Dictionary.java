package com.kodilla.collections.adv.exercises.dictionary;

import java.util.*;

public class Dictionary {
    Map<String, List<EnglishWord>> Dictionary = new HashMap<>();

    public void addWord(String polishWord, EnglishWord englishWord) {
        List<EnglishWord> englishWords =
                Dictionary.getOrDefault(polishWord, new ArrayList<>());
                englishWords.add(englishWord);
                Dictionary.put(polishWord, englishWords);
    }

    public List<EnglishWord> findEnglishWords(String polishWord) {
        return Dictionary.getOrDefault(polishWord, Collections.emptyList());
    }

    public List<EnglishWord> findEnglishWords(String polishWord, PartOfSpeech partOfSpeech) {
        List<EnglishWord> result = new ArrayList<>();
        for(EnglishWord englishWord : Dictionary.getOrDefault(polishWord, Collections.emptyList())) {
            if(englishWord.getPartOfSpeech().equals(partOfSpeech)) {
                result.add(englishWord);
            }
        }
        return result;
    }

    public int size() {
        return Dictionary.size();
    }
}
