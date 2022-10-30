package alenaD_code.task5;

public class PasswordValidation {
    /*
    String -- Password Validation Task
Write a return method that can verify if a password is valid or not.
requirements:

 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

if all requirements above are met, the method returns true, otherwise returns  false
     */

    public static boolean isValidPassword(String password){

            int upperCaseChars = 0;
            int lowerCaseChars = 0;
            int digits = 0;
            int specialChars = 0;


            for (int i = 0; i < password.length(); i++) {
                if(Character.isUpperCase(password.charAt(i)))
                    upperCaseChars++;
                else if(Character.isLowerCase(password.charAt(i)))
                    lowerCaseChars++;
                else if(Character.isDigit(password.charAt(i)))
                    digits++;
                else
                    specialChars++;
            }


            return password.length() >= 6 && !password.contains(" ") && upperCaseChars > 0 && lowerCaseChars > 0 && digits > 0 && specialChars > 0;
    }


    public static void main(String[] args) {
        System.out.println("Is valid password: " + isValidPassword("5968KTYff!"));
    }





}
