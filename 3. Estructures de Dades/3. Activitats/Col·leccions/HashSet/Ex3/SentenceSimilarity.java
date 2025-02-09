package Collections.HashSet.Ex3;

import java.util.HashSet;
import java.util.Set;

public class SentenceSimilarity {

    public static Set<String> string2Set(String sentence) {
        sentence = sentence.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();
        String[] words = sentence.split("\\s+");
        Set<String> wordSet = new HashSet<>();
        for (String word : words) {
            wordSet.add(word);
        }
        return wordSet;
    }

    public static Set<String> intersection(String sentence1, String sentence2) {
        Set<String> set1 = string2Set(sentence1);
        Set<String> set2 = string2Set(sentence2);
        set1.retainAll(set2);
        return set1;
    }

    public static Set<String> union(String sentence1, String sentence2) {
        Set<String> set1 = string2Set(sentence1);
        Set<String> set2 = string2Set(sentence2);
        set1.addAll(set2);
        return set1;
    }

    public static float jaccard(String sentence1, String sentence2) {
        Set<String> intersectionSet = intersection(sentence1, sentence2);
        Set<String> unionSet = union(sentence1, sentence2);
        return (float) intersectionSet.size() / unionSet.size();
    }

    public static void main(String[] args) {
        String sentence1 = "Això és un test";
        String sentence2 = "Aquest test és un altre test";

        Set<String> intersectionResult = intersection(sentence1, sentence2);
        System.out.println("Intersecció: " + intersectionResult);

        Set<String> unionResult = union(sentence1, sentence2);
        System.out.println("Unió: " + unionResult);

        float jaccardResult = jaccard(sentence1, sentence2);
        System.out.println("Similitud de Jaccard: " + jaccardResult);
        System.out.println("Similitud de Jaccard (mateixa frase): " + jaccard(sentence1, sentence1));
        System.out.println("Similitud de Jaccard (frase buida): " + jaccard(sentence1, ""));
    }
}