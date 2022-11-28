package alenaD_code.task_leftovers;

import java.util.ArrayList;
import java.util.List;

/*
ArrayList -- sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using the sort method.

ArrayList -- sorting in descending order
Write a method that can sort the ArrayList in descending order without using the sort method.
 */
public class ArrayList_SortAsc_SortDsc {

    public static ArrayList<Integer> sortAsc(ArrayList<Integer> list){

        if(list.size() <= 1){
            return list;
        }

        ArrayList<Integer> returnList = new ArrayList<>();

        returnList.add(list.get(0));

        for (int j = 1; j < list.size() ; j++) {


                for (int i = 0; i < returnList.size(); i++) {

                    if(list.get(j) <= returnList.get(i)) {
                        returnList.add(i, list.get(j));
                    //    System.out.println(returnList);
                        break;
                    }

                }



                if(!returnList.contains(list.get(j))){
                    returnList.add(returnList.size(), list.get(j));
                 //   System.out.println(returnList);
                }


            }

        return returnList;

    }


    public static ArrayList<Integer> sortDsc(ArrayList<Integer> list){

        if(list.size() <=1 ){
            return list;
        }

        ArrayList<Integer> returnList = new ArrayList<>();
        returnList.add(list.get(0));

        for (int i = 1; i < list.size(); i++) {

            for (int j = 0; j < returnList.size(); j++) {
                if(list.get(i) >= returnList.get(j)){
                    returnList.add(j, list.get(i));
                    break;
                }
            }


            if(!returnList.contains(list.get(i))){
                returnList.add(returnList.size(), list.get(i));
            }


        }


        return returnList;

    }





    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(9,8,67,91,13,74,43,21,11,4,8,15,16,23,42));
        System.out.println("ORIGINAL:");
        System.out.println(integers);
        System.out.println("RESULT ASC:");
        System.out.println(sortAsc(integers));
        System.out.println("RESULT DSC:");
        System.out.println(sortDsc(integers));
    }





}
