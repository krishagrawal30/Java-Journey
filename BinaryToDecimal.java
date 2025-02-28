import java.util.Scanner;
public class BinaryToDecimal 
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a Binary number : ");
        int n = sc.nextInt();
        int b=0,p=1;
        while(n!=0)
        {
            b = b+(n%10)*p;
            p*=2;
            n/=10;
        }
        System.out.println("Its Decimal form is : "+b);
    }
    
}
