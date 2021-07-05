//Преобразовать массив в строку и обратно в массив

import java.util.Arrays;

public class Task_9 {
    public static void main(String args[]) throws Exception {
        String[] stringArray = new String[]{"One", "Two", "Three"};
        String j = Arrays.toString(stringArray);
        System.out.println(j);
        String[] stringArray2 = j.split(",");
        System.out.println(stringArray2[0]);


        // StringBuilder string = new StringBuilder();
        // string.append("[");
        //  for (int i = 0; i < stringArray.length; i++) {
        //     string.append(stringArray[i] + (i == (stringArray.length - 1) ? "" : "; "));
        //    }
        //   string.append("]");
        //  System.out.println(string);
        //  System.out.println(string.toString().substring(1, string.length() - 1).split("; "));
    }
}

