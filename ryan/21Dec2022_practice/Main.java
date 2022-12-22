import java.util.Scanner;

public class Main {
    
    static int is_upper_lower (char c)     // upper case - 1 | lower - 0 | default - (-1)
    {
        if( c>='a' && c<='z' )  return 0;       // lower?
        if( c>='A' && c<='Z' )  return 1;       // upper?
        return -1;                              // default case
    }


    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);
        int ch;
        char c;

        while(true)
        {
            System.out.print("\n----------Menu--------\n1) Enter char\n2) Exit\nEnter you choice: ");
            ch = ip.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.print("\nEnter the char: ");
                    c = ip.next().charAt(0);
                    
                    System.out.println("Result: " + is_upper_lower(c) + "\n");  // calling function

                    break;

                case 2:
                    System.out.println("\nExiting the program\n");
                    ip.close();
                    System.exit(0);
                    
                default:
                    System.out.println("\nEnter the right choice...\n");
            }
        }

    }

}
