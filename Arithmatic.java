import java.util.Scanner;
public class Arithmatic
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int ss= s.nextInt();
        System.out.println("Enter second number : ");
        int sa= s.nextInt();
        System.out.println("The sum is : "+(ss+sa));
        System.out.println("The Difference is : "+(ss-sa));
        System.out.println("The product is : "+(ss*sa));
        System.out.println("The quotient is : "+(ss/sa));
        System.out.println("The remainder is : "+(ss%sa));
    }
}