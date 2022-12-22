import java.util.Scanner;

class functions {

    public void is_prime(int num)
    {
        if(num == 2)
        {
            System.out.println("\nIts a even prime number\n");
            return;
        }

        for(int i=2; i<num-1; i++)
        {
            if(num%i == 0)
            {
                System.out.println("\nIts not a prime number\n");
                return;
            }
        }

        System.out.println("\nIts a prime number\n");
        return;
    }

    //------------------------------------------------------

    public void is_leap(int num)
    {
        boolean _400 = (num%400 == 0)?true:false;
        boolean _100 = (num%100 == 0)?true:false;
        boolean _4 = (num%4 == 0)?true:false;

        if(_400)
        {
            System.out.println("\nIts a leap year\n");
            return;
        }

        if(_100)
        {
            System.out.println("\nIts not a leap year\n");
            return;
        }

        if(_4)
        {
            System.out.println("\nIts a leap year\n");
            return;
        }

        System.out.println("\nIts not a leap year\n");        // default
        return;
    }
}

public class Main {
    
    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);        // init input
        functions F = new functions();
        int ch, num;         // choice variable and num

        System.out.println("\nOnly enter non-negative values:\n\n");

        while(true)
        {
            System.out.println("---------Menu----------");
            System.out.println("1) Is it prime number\n2) Is it leap year\n3) Exit");
            System.out.print("Enter your choice: ");

            ch = ip.nextInt();      // taking in choice

            switch(ch)
            {
                case 1:
                    System.out.print("\nEnter your number: ");
                    num = ip.nextInt();
                    F.is_prime(num);
                    break;
                
                case 2:
                    System.out.print("\nEnter your year: ");
                    num = ip.nextInt();
                    F.is_leap(num);
                    break;

                case 3:
                    System.out.println("\nExiting the program...\n");
                    ip.close();
                    System.exit(0);

                default:
                    System.out.println("\nEnter the right choice...\n");
            }

        }
    }

}
