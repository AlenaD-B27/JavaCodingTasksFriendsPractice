package WeeklyTasks.week_3;

import java.util.Scanner;

public class Armstrong {
    /*

    Numbers -- Armstrong numbers
Write a method that can check if a number is Armstrong number.


     */

public static void main(String[]args){
    int num, s, sum=0, temp;
    System.out.println("Input  a number: \n");
    num = 54748; // original number
      for(temp=num;num!=0;num=num/10){
       	         s=num % 10;
                sum=sum+(s*s*s*s*s);}
   if(sum==temp)
       System.out.println(" is an Armstrong number.\n" + temp);
    else
       System.out.println(" is not an Armstrong number.\n" + temp);
    }} //the end we should get Armstrong number