import java.util.Scanner;
public class NoOfDigits 
{
        public static void main(String[] args) 
        {
            int count = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number : ");
            int n = sc.nextInt();
            while(n>0)
            {
                count ++;
                n/=10;
            }
            System.out.println(count);
        }    
}
