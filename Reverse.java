import java.util.Scanner;
public class Reverse 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,rem,rev=0;
        System.out.println("Enter n : ");
        n = sc.nextInt();
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        } 
        System.out.println("Reverse of that number is "+rev);
    }
}
