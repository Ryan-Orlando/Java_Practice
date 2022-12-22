import java.util.Scanner;

public class Dec152022 {
    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);

        int a, b;

        System.out.print("A: ");
        a = ip.nextInt();

        System.out.print("B: ");
        b = ip.nextInt();
        
        // swapping the numbers without third variable
        
        a = a+b;
        b = a-b;
        a = a-b;
        
        System.out.println("After swapping\nA: " + a + " B: " + b);

        ip.close();
    }

}

// every java program only one complusroy public class
