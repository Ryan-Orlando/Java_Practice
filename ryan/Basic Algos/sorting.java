import java.util.Scanner;

class sorting{

    static long start, end;

    // ----------- printing array -------------

    static void print_arr(int arr[])
    {
        for(int i=0; i<arr.length; i++)  System.out.print(arr[i] + " ");
        System.out.println();
    }

    // ----------- bubble sort -----------------

    static void bubble_sort(int arr[], int n)
    {
        int temp;

        if(n<=1)    return;

        for(int i=0; i<n-1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        bubble_sort(arr, n-1);
    }

    // ----------- insertion sort -----------------

    static void insertion_sort(int arr[], int n, int i)
    {

        if(i>=n-1 || i < 1)  return;     // i at the end of array or empty array

        int k, min = arr[i], temp;

        for(k = i+1; k<n; k++)
        {
            if(arr[k] > min)    min = k;
        }

        temp = arr[k];
        arr[k] = arr[i];
        arr[i] = temp;      // swapping

        insertion_sort(arr, n, i+1);
    }

    // ----------- merge sort -----------------

    static void merge_sort(int arr[], int beg, int mid, int end)
    {
        int n1, n2;
        n1 = mid-beg+1;
        n2 = end-mid;

        int arr1[] = new int[n1];       // declaring two new arrays
        int arr2[] = new int[n2];

        for(int i=0; i<n1; i++)     arr1[i] = arr[beg+i];       // moving two halfs into separate arrays
        for(int i=0; i<n2; i++)     arr2[i] = arr[mid+i+1];

        int i = 0 ,j = 0, k = beg;

        while(i<n1 && j<n2)
        {
            if(arr1[i] < arr2[j])   arr[k++] = arr1[i++];
            else    arr[k++] = arr2[j++];
        }       // merging the halfed arrays

        while(i<n1)     arr[k++] = arr1[i++];
        while(j<n2)     arr[k++] = arr2[j++];       // remaining number merge
    }

    static void divide_arr(int arr[], int beg, int end)
    {
        if(beg >= end)  return;         // if the size of arr is 1 or less

        int mid = (beg+end)/2;

        divide_arr(arr, beg, mid);
        divide_arr(arr, mid+1, end);
        merge_sort(arr, beg, mid, end);
    }

    // --------------------------------------------

    static void arr_copy(int arr[], int cpy[], int n)
    {
        for(int i=0; i<n; i++)  cpy[i] = arr[i];
    }

    // --------------------------------------------

    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);

        int n;
        System.out.print("\nEnter the size of array: ");        // limit of array
        n = ip.nextInt();

        int arr[] = new int[n];       // declaration of array
        int temp[] = new int[n];

        System.out.println("\nEnter " + n + " numbers: ");
        
        for(int i=0; i<n; i++)  arr[i] = ip.nextInt();      // getting the array

        //printing the array
        System.out.println("\nThe entered array: ");
        print_arr(arr);

        arr_copy(arr, temp, n);

        System.out.println();

        // sorting below

        start = System.currentTimeMillis();
        bubble_sort(arr, n);                // bubble sort
        end = System.currentTimeMillis();
        System.out.print("\nBubble sort: Time taken = " + (end - start) + "ms\nArray: ");
        print_arr(arr);

        arr_copy(temp, arr, n);

        start = System.currentTimeMillis();
        insertion_sort(arr, n, 0);                // bubble sort
        end = System.currentTimeMillis();
        System.out.print("\nInsertion sort: Time taken = " + (end - start) + "ms\nArray: ");
        print_arr(arr);

        arr_copy(temp, arr, n);

        start = System.currentTimeMillis();
        divide_arr(arr, 0, n-1);                // bubble sort
        end = System.currentTimeMillis();
        System.out.print("\nMerge sort: Time taken = " + (end - start) + "ms\nArray: ");
        print_arr(arr);

        ip.close();     // closing the scanner object
    }

}