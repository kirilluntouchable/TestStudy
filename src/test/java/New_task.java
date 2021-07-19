public class New_task {
    public static void main(String[] args)
            throws ClassNotFoundException
    {

        Class c = Class.forName("java.lang.String");

        System.out.print("Class добавляет к себе параметр : " + c.toString());
    }

}