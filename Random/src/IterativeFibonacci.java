public class IterativeFibonacci {
    public static void main(String[] args) {
        System.out.println(fib(8));
    }
    public static int fib(int n){
        if (n == 0 || n == 1){
            return n;
        }
        else {
            int temp1 = 0, temp2 = 1, result = 0;

            for (int i = 1; i < n ; i++) {
                result = temp1 + temp2;
                temp1 = temp2;
                temp2 = result;
            }
            return result;
        }
    }
}
