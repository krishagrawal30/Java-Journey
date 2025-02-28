import java.util.Scanner;
class array
{
    public static void main(String[] args)
    {
        int[][] a = new int[3][3];
        System.out.println("Enter elements of array : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                Scanner sc = new Scanner(System.in);
                a[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    } 
}