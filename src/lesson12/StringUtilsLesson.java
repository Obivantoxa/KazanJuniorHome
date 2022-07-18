package lesson12;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsLesson implements StringUtils {

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        double ret;
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 == null || number2 == null");
        }
        double n1 = Double.parseDouble(number1);
        double n2 = Double.parseDouble(number2);
        if (n2 == 0) {
            throw new ArithmeticException("n2=0");
        }
        ret = n1 / n2;
        return ret;
    }
    /**
     * Ищет все вхождения слова <b>word</b> в тексте <b>text</b> и возвращает массив индексов слов
     *
     * @param text исходный текст
     * @param word искомое слово
     * @return масив индексов каждого вхождения слова
     * @throws NullPointerException
     */
    @Override
    public String[] findWord(String text, String word) throws NullPointerException {
        if (text == null || word == null) {
            throw new NullPointerException("text == null || word == null");
        }
        String[] textMassiv = text.split(" ");
        for (int i = 0; i<textMassiv.length;i++){

        }

//        List<String> keyWords = new ArrayList<>();
//        List<String> howManyWords = new ArrayList<>();
//        keyWords.add(word);
//
//        String words = new String();
//        String patternString = "\\b(" + String.join("|", keyWords) + ")\\b";
//        Pattern pattern = Pattern.compile(patternString);
//        Matcher matcher = pattern.matcher(text);
//
//        while (matcher.find()) {
//            words = matcher.group(1);
//            howManyWords.add(words);
//
//        }
//        if (howManyWords.isEmpty()){
//            throw new NullPointerException("Текст не содержет требуемого слова \"" + word + "\"");
//        }
//        String[] result = new String[howManyWords.size()];
//        for (int i = 0; i < result.length; i++) {
//            result[i] = howManyWords.get(i);
//        }
//        return result;
        return textMassiv;
    }


    @Override
    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }
}
