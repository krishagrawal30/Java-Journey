import java.util.*;
class MultMatrix
{
    public static void main(String[] args)
    {
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter Rows : ");
        int a = s.nextInt();
        System.out.println("Enter Columns : ");
        int b = s.nextInt();
        int[][] arr1 = new int[a][b];
        int[][] arr2 = new int[a][b];
        int[][] arr3 = new int[a][b];
        int count = 1;
        for(int i = 0;i<a;i++)
        {
            for(int j = 0;j<b;j++)
            {
                arr1[i][j]=count;
                arr2[i][j]=count;
                count++;
            }
        }
        for(int i = 0;i<a;i++)
        {
            for(int j = 0;j<b;j++)
            {
                arr3[i][j] = 0;
                for(int k = 0;k<b;k++)
                {
                    arr3[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        for(int i = 0;i<a;i++)
        {
            for(int j = 0;j<b;j++)
            {
                System.out.print(arr3[i][j]+"\t");
            }
            System.out.println();
        }
    }
}