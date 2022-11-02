package task4;

import java.util.Scanner;

public class PasswordValidation {
//    Write a return method that can verify if a password is valid or not.
//    requirements:
//
//            1. Password MUST be at least have 6 characters and should not contain space
//2. PassWord should at least contain one upper case letter
//3. PassWord should at least contain one lowercase letter
//4. Password should at least contain one special characters
//5. Password should at least contain a digit
//
//if all requirements above are met, the method returns true, otherwise returns  false
        public static void main(String[] args) {
            System.out.println("Enter password :");
            Scanner scanner = new Scanner(System.in); 
            String myinput = scanner.nextLine();
            int numVal = Validation(myinput); // Call method Validation with the myinput string
            if(numVal == 1){
                System.out.println("It is a valid password, true");
            }
            else {
                System.out.println("It is not a valid password, false");
            }
        }
        // In this Validation  Private method, used the regex pattern to check if the password matches the said rule above
        private static int Validation(String s1) {
            if(s1.matches(".*[0-9]{1,}.*") && s1.matches(".*[@#$]{1,}.*") && s1.length() >= 6 && s1.length() <= 20){
              // If validation matches, return integer value 1 else return -1
                return  1;
            }
            else
            {
                return -1;
            }
        }

}