import java.util.Scanner;

class pat {

    void pat1(int para) {
        for (int i = 1; i <= para; i++) {
            for (int j = 1; j <= para; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    void pat2(int para) {
        for (int i = 1; i <= para; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    void pat3(int para) {
        for (int i = 1; i <= para; i++) {
            for (int j = 1; j <= para; j++) {
                if (j >= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }

    void pat4(int para) {
        for (int i = 1; i <= para; i++) {
            for (int j = 1; j <= para; j++) {
                if (j > (para - i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }

    void pat5(int para) {
        for (int i = 1; i <= para; i++) {
            for (int j = 1; j <= para; j++) {
                if (j < (para - i + 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }

    void pat6(int para, int mode) {
        
        for (int i = 1; i <= para; i++) {
            if(mode == 1 && i == 1) continue;
            if(mode == 1)   System.out.print(" ");
            for (int j = 1; j < para - i + 1; j++)
                System.out.print(" ");

            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");

            System.out.println();
        }
    }

    void pat7(int para) {
        for (int i = para; i >= 1; i--) {
            for (int j = 1; j <= (para - i + 1); j++)
                System.out.print(" ");

            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");

            System.out.println();
        }
    }

    void pat8(int para)
    {
        pat6(para, 0);
        pat7(para-1);
    }

    void pat9(int para)
    {
        pat7(para);
        pat6(para, 1);
    }

    void pat10(int para)
    {
        for(int i=1; i<=para; i++)
        {
            for(int j=1; j<=para; j++)
            {
                if(i==1 || i==para)
                    System.out.print("*");
                
                else if(j>1 && j<para)
                    System.out.print(" ");
                
                else 
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    void pat11(int para)
    {
        for(int i=1; i<=para; i++)
        {
            for(int j=1; j<=para; j++)
            {
                System.out.print("5");
            }
            System.out.println();
        }
    }

    void pat12(int para)
    {
        for(int i=1; i<=para; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void pat13(int para)
    {
        for(int i=1; i<=para; i++)
        {
            for(int j=5; j>=1; j--)
            {
                if(j<=i)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    void pat14(int para)
    {
        int j=0;
        for(int i=1; i<=para; i++)
        {
            j=i;
            while(i>0)
            {
                System.out.print(i);
                i--;
            }
            i=j;
            System.out.println();
        }
    }

    void pat15(int para)
    {
        for(int i=1; i<=para; i++)
        {
            for(int j=1; j<=i; j++)
                System.out.print(j);
            
            System.out.println();
        }
    }
}


public class Main {

    static int para = 5;

    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in); // Scanner object here
        int ch;
        pat P = new pat();

        while (true) {
            System.out.print("\n--------------------Menu--------------------\n");
            System.out.print("1) Pattern\n16) Exit\nEnter your choice: ");
            ch = ip.nextInt();

            switch (ch) {
                case 1:
                    P.pat1(para);
                    break;

                case 2:
                    P.pat2(para);
                    break;
                
                case 3:
                    P.pat3(para);
                    break;
                
                case 4:
                    P.pat4(para);
                    break;
                
                case 5:
                    P.pat5(para);
                    break;
                
                case 6:
                    P.pat6(para, 0);
                    break;

                case 7:
                    P.pat7(para);
                    break;
                
                case 8:
                    P.pat8(para);
                    break;

                case 9:
                    P.pat9(para);
                    break;
                
                case 10:
                    P.pat10(para);
                    break;
                
                case 11:
                    P.pat11(para);
                    break;
                
                case 12:
                    P.pat12(para);
                    break;
                
                case 13:
                    P.pat13(para);
                    break;
                
                case 14:
                    P.pat14(para);
                    break;
                
                case 15:
                    P.pat15(para);
                    break;
                
                case 16:
                    System.out.println("Exiting the program...\n");
                    ip.close();
                    System.exit(0); // exiting the program

                default:
                    System.out.println("Enter the right option...\n");
            }

        }
    }
}
