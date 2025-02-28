import java.util.Scanner;
public class NthFactorial 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int k=1;
        while(k<=n)
        {
            int fact=1;
            for(int i=1;i<=k;i++)
            {
                fact=fact*i;
            }
            System.out.println(fact);
            k++;
        }
    }
}
