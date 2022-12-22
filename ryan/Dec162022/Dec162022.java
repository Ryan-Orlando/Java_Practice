import java.util.Scanner;

public class Dec162022 {
    
    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);

        char ch;
        int sum = 0;

        System.out.print("\nEnter char: ");
        ch = ip.next().charAt(0);       // to take char at index 0 from string

        System.out.print("\nEnter three integers: ");
        for(int i=0; i<3; i++)  sum += ip.nextInt();

        int avg = (int)(sum/3);

        System.out.println("\n\nPrinting:\nChar: " + ch + "\nAvg: " + avg);

        ip.close();
    }

}
