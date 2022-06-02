package lesson3;

public class HomeWork3 {
    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        int[][] nums = new int[n][m];

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {
                if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print(nums[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("- - - - -");
        //что то пошло не так))
//        for (int i = nums.length-1; i < nums.length; i--) {
//            for (int j = 0; j < nums[i].length; j++) {
//                if (i != j) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print(nums[i][j] + " ");
//                }
//            }
//            System.out.println();
//        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i + j == nums.length - 1) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println("~~~~~~~~~");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i == (nums.length - 1) / 2 || j == (nums[i].length - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println("~~~~~~~~~");

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                if ((i == (nums.length - 1) / 2) || (j == (nums.length - 1) / 2)) {
                    System.out.print("* ");
                } else if (i != -j) {
                    System.out.print("* ");
                } else {
                    System.out.print(nums[i][j] + " ");

                }


            }
            System.out.println();

        }
        //для текста /*Так как в самом начале StringBuffer инициализируется строкой "Java", то его емкость составляет 4 + 16 = 20 символов. Затем мы увеличиваем емкость буфера с помощью вызова strBuffer */
//        1) посчитать количество букв без пробела
        String text = "Так как в самом начале StringBuffer инициализируется строкой \"Java\", то его емкость составляет 4 + 16 = 20 символов. Затем мы увеличиваем емкость буфера с помощью вызова strBuffer ";

        int simvolSumma = 0;
        for (int i = 0; i < text.length(); i++) {
            char simvol = text.charAt(i);
            if (simvol != ' ') {
                simvolSumma++;
            }
        }
        System.out.print("1) Всего символов за исключением пробела: " + simvolSumma);

//      2) посчитать количество английских букв
        System.out.print("\n\n2) Английских букв: ");
        int engSimNumber = 0;
        for (int i = 0; i < text.length(); i++) {
            char engSim = text.charAt(i);
            if (engSim == 'a' || engSim == 'b' || engSim == 'c' || engSim == 'd' || engSim == 'e' || engSim == 'f' || engSim == 'g' || engSim == 'h' || engSim == 'i' || engSim == 'j' || engSim == 'k' ||
                    engSim == 'l' || engSim == 'm' || engSim == 'n' || engSim == 'o' || engSim == 'p' || engSim == 'q' || engSim == 'r' || engSim == 's' || engSim == 't' || engSim == 'u' || engSim == 'v' ||
                    engSim == 'w' || engSim == 'x' || engSim == 'y' || engSim == 'z' || engSim == 'A' || engSim == 'B' || engSim == 'C' || engSim == 'D' || engSim == 'E' || engSim == 'F' || engSim == 'G' ||
                    engSim == 'H' || engSim == 'I' || engSim == 'J' || engSim == 'K' || engSim == 'L' || engSim == 'M' || engSim == 'N' || engSim == 'O' || engSim == 'P' || engSim == 'Q' || engSim == 'R' ||
                    engSim == 'S' || engSim == 'T' || engSim == 'U' || engSim == 'V' || engSim == 'W' || engSim == 'X' || engSim == 'Y' || engSim == 'Z') {
                engSimNumber++;
            }
        }
        System.out.print(engSimNumber);

//      3) все цифры заменить на звездочку (*)
        System.out.print("\n\n3) ");
        for (int i = 0; i < text.length(); i++) {
            char number = text.charAt(i);
            if (number == '0' || number == '1' || number == '2' ||
                    number == '3' || number == '4' || number == '5'
                    || number == '6' || number == '7' || number == '8' || number == '9') {
                number = '*';
            }
            System.out.print(number);
        }

//      4) после каждой точки или запятой перходить на новую строчку
        System.out.print("\n\n4) ");
        for (int i = 0; i < text.length(); i++) {
            char paragraph = text.charAt(i);
            if (paragraph == '.' || paragraph == ',') {
                System.out.print(paragraph + "\n");
            } else System.out.print(paragraph);
        }

//      5)вывести все с заглавной буквы
        System.out.print("\n\n5) ");
        String text2 = "";
        String[] words = text.split(" ");   //разбиваем текст по пробелам на массив, сотоящий из слов
        for (int i = 0; i < words.length; i++) {
            String letter1 = words[i].substring(0, 1).toUpperCase();   //первую букву слова делаем заглавной
            String letter2 = words[i].substring(1);          //записываем остальные буквы слова
            text2 = letter1 + letter2 + " ";                          //соединяем первую букву с остальными и добавляем пробел
            System.out.print(text2);
        }




    }
}


