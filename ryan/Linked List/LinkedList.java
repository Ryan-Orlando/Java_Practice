import java.util.Scanner;

public class LinkedList {
    
    static class node{      // node data structure
        int data;
        node nextnode;

        node(int data)
        {
            this.data = data;
            nextnode = null;
        }
    }

    //----------------------- Insert into list -------------------------------------

    static node insert(node head, int d)        // cannot pass head as reference so i must return it back
    {
        node newnode = new node(d);

        if(head == null)    head = newnode;

        else{
            node temp = head;
            while(temp.nextnode != null)    temp = temp.nextnode;   // tempnode must be at the last node

            temp.nextnode = newnode;    // inserting here
        }

        return head;
    }

    //------------------------Print list -----------------------------------

    static void print_list(node head)
    {
        System.out.println("Printing the list:");

        node temp = head;

        if(temp == null)
        {
            System.out.println("\nEmpty list");
            return;
        }

        while(temp != null)     // travesing through the list
        {
            System.out.print( temp.data + " ");
            temp = temp.nextnode;
        }
    }

    //---------------------------------------------------------------
    //-------------------------- Main ---------------------------------

    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in); 
        
        node head = null;

        head = insert(head, 1);
        head = insert(head, 2);
        head = insert(head, 3);
        print_list(head);

        ip.close();
    }

}
