import java.util.Scanner;

public class Operator1 {
    public static void main(String[] args) {

        System.out.print("Введи первую часть времени: ");
        Scanner inputTime1 = new Scanner(System.in);
        int time1 = inputTime1.nextInt();

        if (time1 <= 22) {
            System.out.println("Смотрим Телевизор");
        } else {
            if (time1 > 22) {
                System.out.println("Идём спать");
            }
        }
        System.out.print("Введи вторую часть времени: ");
        Scanner inputTime2 = new Scanner(System.in);
        int time2 = inputTime1.nextInt();
        System.out.print("Введи кол-во денег: ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();

        if (time2 <= 12 && i >= 10) {
            System.out.println("Иду в магазин");
        } else {
            if (time2 > 13 && i >= 50) {
                System.out.println("Идём в кафе");
            } else {
                System.out.println("Идём к соседу");
            }
        }
    }
}










//if (time1 <= 12 && i >= 10) {
//    System.out.println("Иду в магазин");
//  } else {
//     if (time1 > 13 && i >= 50) {
//         System.out.println("Идём в кафе");
//    } else {
//        System.out.println("Идём к соседу");
//     }
//     System.out.print("Введи вторую часть времени: ");
//     Scanner inputTime2 = new Scanner(System.in);
//     int time2 = inputTime1.nextInt();
//    if (time1 > time2 && i == 0) {

//        System.out.println("Смотрю Телек");
//    } else {
//        if (time2 > 22) {
//            System.out.println("Иду спать")