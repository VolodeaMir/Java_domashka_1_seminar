// Задача 1_3_1. Измените порядок слов на противоположный.
// Вам нужно сократить несколько пробелов между двумя словами до одного пробела в перевернутой строке.

public class homework_1_3_1 {
    public static void main(String[] args) {
        String Str = "a good   example";
        Str = Str.replaceAll("\\s{2,}", " "); // Присвоение результата замены переменной Str
        String outText = new String();
        String[] array = Str.split(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            outText += array[i] + " ";
        }
        System.out.println(outText);
    }
}
