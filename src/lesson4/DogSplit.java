package lesson4;

public class DogSplit {

    public static void dogSpliting(String yourStringMail) {
        String[] result = yourStringMail.split("@");
        if (result.length != 2) {
            throw new IllegalArgumentException("В почте записана больше одной или нет " +
                    " собачки, либо собачка в конце почты ");
        }
        String left = result[0]; //до собачки "example"
        String right = result[1];// после собачки "mail.ru"
        char[] resultMailArray = yourStringMail.toCharArray();
        char[] leftCharArray = left.toCharArray();
        char[] rightCharArray = right.toCharArray();
        System.out.println(leftCharArray);//это чисто для проверки
        System.out.println(rightCharArray);//это чисто для проверки
        if (!right.contains(".")) {
            throw new IllegalArgumentException("Точек после \"@\" нет");
        }
        for (int i = 0; i < resultMailArray.length; i++) {
            if (resultMailArray[0] == '@') {
                throw new IllegalArgumentException("В начале почты первый символ \"@\"");
            }
        }
        int countRightDot = 0;
        for (int i = 0; i < rightCharArray.length; i++) {
            char element = rightCharArray[i];
            if (element == '.') {
                countRightDot = countRightDot + 1;
            }
            if (rightCharArray[0] == '.') {
                throw new IllegalArgumentException("Точка \".\" стоит сразу после \"@\"");
            }
            if (countRightDot >= 2) {
                throw new IllegalArgumentException("Точек \".\" после \"@\" больше 2");
            } else if (countRightDot == 1) {
                continue;
            }
        }
        System.out.println("Почта "+yourStringMail+" в порядке");
    }
}
