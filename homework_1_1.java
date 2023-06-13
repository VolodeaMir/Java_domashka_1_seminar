// Задача 1_1. Измените порядок слов на противоположный.

public class homework_1_1 {
    public static void main(String[] args) {
        String Str = new String("the sky is blue");
        String outText = new String();
        String[] array = Str.split(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            outText += array[i] + " ";
        }
        System.out.println(outText);
    }
}
