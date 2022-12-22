import java.util.*;

public class program {
    public static void main(String[] args) {
        System.out.print("Enter:");
        Scanner sc = new Scanner(System.in);
        char word = sc.next().charAt(0);
        if (Character.isLowerCase(word)) {
            System.out.println(0);
        } else if (Character.isUpperCase(word)) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }
}
