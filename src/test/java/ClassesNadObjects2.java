public class ClassesNadObjects2 {
    public static void main(String[] args) {
        Person5 kirill = new Person5();
        Person5 romagn = new Person5();

        kirill.printClassName(20, "putin");

    }
}
class Person5 {
    private String name;

    public Person5(){

    }

    public Person5(String name) {
       this.name = name;
    }

    public void printClassName(int age, String surename){
        System.out.println(this.getClass().getName() + name + " " + age + " " + surename);

    }

}

