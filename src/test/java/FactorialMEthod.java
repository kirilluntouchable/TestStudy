public class FactorialMEthod {
    public static void main(String[] args) {
        counter(4);
    }
    private static void counter(int n) {
        if (n == 0)
            return;
        System.out.println(n);

        counter(n - 1);
    }
}
