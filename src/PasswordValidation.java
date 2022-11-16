public class PasswordValidation {

    public static boolean passwordValidOrNot(String password) {

        int totalChar = password.length();
        int upperCase = 0;
        int lowerCase = 0;
        int digit = 0;
        int specialChar = 0;
        int space = 0;

        for (int i = 0; i < password.length(); i++) {
            if (totalChar >= 6) {
                if (Character.isUpperCase(password.charAt(i))) {
                    upperCase++;
                } else if (Character.isLowerCase(password.charAt(i))) {
                    lowerCase++;
                } else if (Character.isDigit(password.charAt(i))) {
                    digit++;
                }else if (Character.isWhitespace(password.charAt(i))){
                    space++;
                } else if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i)) && !Character.isWhitespace(password.charAt(i))) {
                    specialChar++;

                }
            }
        }
        if (upperCase >= 1 && lowerCase >= 1 && digit >= 1 && specialChar >= 1 && space < 1) {
            return true;
        } else {
            return false;

        }
    }

    public static void main(String[] args) {
        System.out.println(passwordValidOrNot("2lRf@ fdd"));
    }

}









