package practice4;

public class PasswordValidation {
    public static void main(String[] args) {
        System.out.println("passwordValidation(\"-nkdhkj628\") = " + passwordValidation("-nkdhkj628"));
    }
    //4️⃣ String -- Password Validation Task
    //Write a return method that can verify if a password is valid or not.
    //requirements:
    //
    // 1. Password MUST be at least have 6 characters and should not contain space
    //2. PassWord should at least contain one upper case letter
    //3. PassWord should at least contain one lowercase letter
    //4. Password should at least contain one special characters
    //5. Password should at least contain a digit
    //
    //if all requirements above are met, the method returns true, otherwise returns  false
    //
    public static boolean passwordValidation (String str){
        boolean isValid = false;
        isValid = str.contains(" ");

        char upperLetter=0, lowerLetter=0, digit=0, specialChar=0, totalLength=0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                digit++;
            } else if (Character.isUpperCase(str.charAt(i))) {
                upperLetter++;
            }else if(Character.isLowerCase(str.charAt(i))){
                lowerLetter++;
            } else  {
                specialChar++;
            }
            totalLength++;//will count how many char we will have
        }

        isValid = totalLength >= 6 && digit >= 1 && upperLetter >= 1 && lowerLetter >= 1 && specialChar >= 1;

        return isValid;
    }
}
