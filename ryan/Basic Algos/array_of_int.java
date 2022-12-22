import java.util.Scanner;

class array_of_int{

    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);

        int n;
        System.out.print("\nEnter the size of array: ");        // limit of array
        n = ip.nextInt();

        int arr[] = new int[n];       // declaration of array

        System.out.println("\nEnter " + n + " numbers: ");
        
        for(int i=0; i<n; i++)  arr[i] = ip.nextInt();      // getting the array

        //printing the array
        System.out.println("\nThe entered array: ");
        for(int i=0; i<n; i++)  System.out.print(arr[i] + " ");

        System.out.println();

        ip.close();     // closing the scanner object
    }

}