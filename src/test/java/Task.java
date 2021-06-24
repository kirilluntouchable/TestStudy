public class Task {

        public static void main(String[] args) {
            int[] number = {1, 8, 15, -7, 35};
            double sum = 0;
            for (int x: number) {
                sum += x;
            }
            System.out.print("Среднее арифметическое число: " + sum/number.length);
        }

    }


