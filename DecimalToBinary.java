import java.util.Scanner;
public class DecimalToBinary 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a decimal number : ");
        int n = sc.nextInt();
        int b=0,p=1;
        while(n!=0)
        {
            b = b+(n%2)*p;
            p*=10;
            n/=2;
        }
        System.out.println("Its Binary form is : "+b);
    }
    
}
