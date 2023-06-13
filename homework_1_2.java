// Задача 1_2. Измените порядок слов на противоположный.
// Ваша перевернутая строка не должна содержать начальных или конечных пробелов.

public class homework_1_2 {
    public static void main(String[] args) {
        String Str = new String("  hello world  ");
        String outText = new String();
        String[] array = Str.split(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            outText += array[i] + " ";
        }
        System.out.println(outText);
    }
}
