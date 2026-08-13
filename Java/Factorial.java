import java.util.*;

class Factorial {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), f = 1;
        sc.close();

        for (int i = 1; i <= n; i++)
            f *= i;

        System.out.println("Factorial: " + f);
    }
}