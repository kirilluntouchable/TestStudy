public class Test333 {
    public static void main(String[] args) {

        int[] number = {1, 5, 8, 0, 9};



      for (int x: number){
          System.out.println(x);
      }
      int[] result = arraySwap(number, 0, 4);
       for (int n: result){
            System.out.println(n);
        }
    }

  public static int[] arraySwap(int[] args, int number, int number2) {
       int temp = args[number];
       args[number] = args[number2];

       args[number2] = temp;
        return args;

   }
}
//    int[] number = {1, 5, 8, 0, 9};
//   for(int x = number.length - 1; x >= 0; x--){
//        System.out.println(number[x]);

//     }