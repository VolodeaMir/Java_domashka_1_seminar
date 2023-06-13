// Задача 1_3_2. Измените порядок слов на противоположный.
// Вам нужно сократить несколько пробелов между двумя словами до одного пробела в перевернутой строке.
// Напишите пожалуйста какой подход был более правельный 3_1 или этот 3_2.

public class homework_1_3_2 {

    public static void main(String[] args) {
        String str = "a good   example";
        str = str.replaceAll("\\s+", " ");

        StringBuilder reversedText = new StringBuilder();
        String[] words = str.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            reversedText.append(words[i]).append(" ");
        }

        System.out.println(reversedText.toString().trim());
    }
}
