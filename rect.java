import java.util.Scanner;
class data
{
    int l,b;
    void get()
    {
        System.out.print("Enter length and breadth of rectangle : ");
    }   
    void display()
    {
        System.out.println("Area of rectangle : "+ l*b);
    }
}
public class rect
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        data d = new data();
        d.get();
        d.l = sc.nextInt();
        d.b = sc.nextInt();
       
        d.display();
    }

}