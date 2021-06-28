//Преобразовать массив в строку и обратно в массив

public class Task_9 {
    public static void main(String args[]) throws Exception {
        String[] stringArray = new String[] { "One,", "Two", "Three" };
        StringBuilder string = new StringBuilder();
        string.append("[");
        for (int i = 0; i < stringArray.length; i++) {
            string.append(stringArray[i] + (i == (stringArray.length - 1) ? "" : "; "));
        }
        string.append("]");
        System.out.println(string);
        System.out.println(string.toString().substring(1, string.length() - 1).split("; "));
    }
}

