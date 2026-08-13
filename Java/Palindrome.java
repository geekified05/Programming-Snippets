import java.util.*;

class Palindrome {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String r = new StringBuilder(s).reverse().toString();

        System.out.println(s.equals(r) ? "Palindrome" : "Not a palindrome");
    }
}