import java.util.Scanner;

class person{

    public String name;

    person(String name)
    {
        this.name = name;
    }
}

class student extends person{

    public String roll_no;

    student(String x, String y)
    {
        super(x);
        roll_no = y;
    }

    void display()
    {
        System.out.println("\nName: " + name);      
        // here no need to have 'super.name' since class student does not have a object named 'name'
        System.out.println("Roll No: " + roll_no);
    }
}

class oops{
    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);

        student arr[] = new student[2];
        arr[0] = new student("Hello", "123");
        arr[1] = new student("World", "456");       // array of objects

        String name, roll_no;
        System.out.print("Name: ");     name = ip.nextLine();
        System.out.print("Roll No: ");  roll_no = ip.nextLine();

        student S = new student(name, roll_no);

        S.display();

        ip.close();
    }
}