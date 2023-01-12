import java.util.*;

public class IQ1 {
    /*
    input  str={"eat", "tea", "tam", "ate", "mat", "bat"}

output {{"bat"},{"mat", "tam"},{"ate","eat","tea"}}
     */


    public static void main(String[] args) {

        String[] input = {"eat", "tea", "tam", "ate", "mat", "bat"};
        Map<String, List<String>> anagrams = new HashMap<>();


        for (String eachWord : input) {

            char[] chars = eachWord.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

             if (anagrams.containsKey(sortedWord)) {
                List<String> updatedList = anagrams.get(sortedWord);
                updatedList.add(eachWord);
                anagrams.put(sortedWord, updatedList);
           } else {
                 List<String> newValue = new ArrayList<>();
                 newValue.add(eachWord);
                 anagrams.put(sortedWord, newValue);
             }


            }


        System.out.println(anagrams.values());

    }
}
