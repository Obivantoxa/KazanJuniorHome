package lesson4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCheck {

    /*
     2)проверить пароль
          2.1) пароль не должен соответствовать почте
          2.2) минимум 8 символов
          2.3) одна заглавная
          2.4) один символ
          2.5) на английском
          ***2.7) нне должно быть три символо подряд. sdfgkeeehxjsd не должно быть!
     */
    public static void passwordChecking(String password, String mail) {
        String[] result = password.split(" ");
        if (result.length == 2) {
            throw new IllegalArgumentException("В пароле есть пробел");
        }
        if (password.equals(mail)) {
            System.out.println("Your password equals your mail. fix it ");// 2.1) пароль не должен соответствовать почте
        }
        if (password.length() < 8) { //  2.2) минимум 8 символов
            System.out.println("you have a very short password " + password.length() + " characters");
        }
        boolean resultIsUpper = false;
        char[] array = password.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char x = array[i];
            if (Character.isUpperCase(x)) {
                resultIsUpper = true;
                break;
            }
        }
        if (resultIsUpper==false) { //   2.3) одна заглавная
            System.out.println("Your password don't have Uppercase characters ");
        }

    }

    public static void charCheckPass(String password){ // 2.4) один символ
        String inputPassword = password;
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        for (int i=0; i < inputPassword.length() ; i++)
        {
            char ch = inputPassword.charAt(i);
            if(specialCharactersString.contains(Character.toString(ch))) {
                System.out.println(inputPassword+ " contains special character");
                break;
            }
            else if(i == inputPassword.length()-1)
                System.out.println(inputPassword+ " does NOT contain special character");
        }
    }

    public static void engPassCheck(String password){

        boolean onlyLatinAlphabet = password.matches("^[a-zA-Z0-9]+$");

        if (onlyLatinAlphabet==false){
            System.out.println("Password must  contains only eng letters");
        }

    }

    public static void povtor(String password){
        String text = password;
        int maxLen = 0;

        Matcher m = Pattern.compile("(.)\\1+").matcher(text);
        while (m.find()) {
            String sub = m.group();
            //System.out.println(sub);
            if (sub.length() > maxLen) {
                maxLen = sub.length();
            }
        }
        if (maxLen>=3){
            System.out.println("You have entered three identical characters in a row.");
        }

       // System.out.println("\nmaxLen: " + maxLen);
    }



}
