import java.util.Scanner;

public class testik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возвраст");
        int age = scanner.nextInt();
        switch (age){
            case  0 :
                System.out.println("Ты родился");
                break;
            case  7 :
                System.out.println("Ты пошёл в школу");
                break;
            case  18:
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("Ни одно из предыдущих условий не выполнено");

        }

    }
}



