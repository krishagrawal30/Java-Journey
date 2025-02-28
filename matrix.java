import java.util.Scanner;
class matrix
{
    public static void main(String[] arg)
    {
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        System.out.println("Enter elements of matrix 1 : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                Scanner sc = new Scanner(System.in);
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of matrix 2 : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                Scanner sc = new Scanner(System.in);
                b[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int con = 0;
                for(int k=0;k<3;k++)
                { 
                    c[i][j] = con + a[i][k]*b[k][j];
                    con = c[i][j];
                }
            }
        }
        System.out.println("The product of the two matrix is : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }    
    }
}
