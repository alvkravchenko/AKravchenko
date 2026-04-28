public class Main {
    public static void main(String[] args) {

        System.out.println(reverse("J@va the be$t!123"));
    }

    public static String reverse(String line) {
        if (line == null || line.isEmpty()) { // проверка на пустую строку и null
            return "";
        }
        char[] chars = line.toCharArray();
        int start = 0;
        int end = chars.length - 1;


        while (start < end) {
            if (!Character.isLetter(chars[start])) {
                start++;
            } else if (!Character.isLetter(chars[end])) {
                end--;
            } else {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }
        return new String(chars);
    }
}
