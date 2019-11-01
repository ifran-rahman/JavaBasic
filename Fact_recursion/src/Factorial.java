import java.util.Scanner;

public class Factorial {


    public static void main(String[] args) {

        System.out.println(fact(5));
    }

    public static int fact(int n) {
        int sum = 0;

        if (n == 1) {
            return 1;
        } else {
            sum = fact(n - 1) * n;
        }
        return sum;

    }
}

