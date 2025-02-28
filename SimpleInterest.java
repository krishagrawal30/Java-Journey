import java.util.Scanner;
public class SimpleInterest
{
	public static void main(String[] args)
	{
		float si;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal value : ");
		float p=sc.nextFloat();
		System.out.println("Enter rate of interest : ");
		float r=sc.nextFloat();
		System.out.println("Enter the tenure : ");
		float t=sc.nextFloat();
		si=p*r*t/100;
		System.out.println("Enter the principal value : "+si);
	}
}