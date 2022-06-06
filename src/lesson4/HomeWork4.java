package lesson4;

public class HomeWork4 {

    /*1)проверить почту на правильность
      1.1)одна @
      1.2) должна быть однаточка
      1.3) точка не должна быть вначале/конце слова, собачки, две подряд

      2)проверить пароль
      2.1) пароль не должен соответствовать почте
      2.2) минимум 8 символов
      2.3) одна заглавная
      2.4) один символ
      2.5) на английском
      ***2.7) нне должно быть три символо подряд. sdfgkeeehxjsd не должно быть!

      3)сделать калькулятор вотдельном класе
     */
    public static void checkDog(String yourMail) {
        String str = yourMail;
        if (str.contains("@")) {
            System.out.println("почта содержит собачку- уже хорошо");
        } else
            System.out.println("в почте нет собачек");
                // проверка №1
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char element = charArray[i];
            if ((charArray[0] == '@')||(charArray[charArray.length-1]=='@')) {
                System.out.println("собачка первая так нельзя ");
                break;
                //  проверка №2
            } else {
                for (i = 0; i < charArray.length; i++) {
                    char elementt = charArray[i];
                    int countDogs = 0;
                    if (elementt == '@') countDogs++;
                    if (countDogs > 1) {
                        System.out.println("проверьте почту " + countDogs + " собачек");
                        break;
                    }
                }
                System.out.println("c собачками все хорошо");
                System.out.println("осталось проверить точки...");
            }
        }
    }

    public static void dotAtStart(String yourMail) {
        String str = yourMail;
        if (str.contains(".")) {
            System.out.println("почта содержит точку - уже хорошо");


        } else {
            System.out.println("точек в почте нет ");
        }
    }


    public static void main(String[] args) {
        String mail = "exam.plemail.ru@";
        checkDog(mail);
        dotAtStart(mail);
    }
}






