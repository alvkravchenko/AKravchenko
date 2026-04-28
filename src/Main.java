public class Main {
    public static void main(String[] args) {

        System.out.println(reverse("J@va the be$t!123"));
    }

    public static String reverse(String line) {
        if (line == null || line.isEmpty()) { // проверка на пустую строку и null
            return "";
        }
        char[] chars = line.toCharArray(); // массив символов из строки
        char[] result = new char[chars.length]; // массив для результата метода

        StringBuilder letters = new StringBuilder(); // изменяемая строка для хранения символов в обратном порядке
        for (int i = chars.length - 1; i >= 0; i--) { // цикл с конца массива
            if (Character.isLetter(chars[i])) { // условие, если символ буквенный
                letters.append(chars[i]); // запись символа в строку
            }
        }

        int letterIndex = 0; // переменная для индекса символа в изменяемой строке
        for (int i = 0; i < chars.length; i++) { // цикл по массиву символом для корректной длины строки
            if (Character.isLetter(chars[i])) { // проверка на буквенный символ
                result[i] = letters.charAt(letterIndex); // запись буквенного символа из строки с обратным порядком
                letterIndex++;
            } else {
                result[i] = chars[i]; // запись не буквенного символа с сохранением позиции
            }
        }
        return new String(result);
    }
}
