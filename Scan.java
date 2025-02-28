import java.util.Scanner;
public class Scan 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int ss= s.nextInt();
        System.out.println(ss);
        System.out.println("Enter a word ");
        String a = s.next();
        System.out.println(a);
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter a line");
        String l = scann.nextLine();
        System.out.println(l);
    }
    
}
