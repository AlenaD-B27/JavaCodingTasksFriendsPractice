package alenaD_code.task_leftovers;

/*
ArrayList -- Remove "Ahmed"
Given a list of people's names: "Ahmed," "John," Eric," "Ahmed,".....
Write a java operation to remove all the names named Ahmed.
 */

import java.util.*;

public class ArrayList_RemoveAhmet {

    public static ArrayList<String> removeWord (String word, ArrayList<String> listOfWords){

        listOfWords.removeIf(p -> p.equalsIgnoreCase(word));

        return listOfWords;

    }


    public static void main(String[] args) {

        System.out.println(removeWord("Ahmed" ,new ArrayList<>(Arrays.asList("Ahmed" , "John" , "Eric" , "Ahmed"))));


    }



}
