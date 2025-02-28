import java.util.Scanner;
class array
{
    private int row,column;
    private int[][] arr;
    public array(int row, int column)
    {
        this.row = row;
        this.column = column; 
        this.arr = new int[row][column];
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of matrix : ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print("Element ["+i+"]["+j+"] : ");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
    void display()
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    int sum()
    {
        int sum=0; 
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                sum = sum + arr[i][j];
            }
        } 
        return sum;
    }
    void transpose()
    {
        System.out.println("Transpose : ");
        for(int j=0;j<column;j++)
        {
            for(int i=0;i<row;i++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
public class oops_array
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in); 
        System.out.print("Enter rows : ");
        int row = s.nextInt();
        System.out.print("Enter columns : ");
        int column = s.nextInt();
        array a1 = new array(row,column);
        a1.input();
        a1.display();
        System.out.println("The sum of all elements of matrix is : "+a1.sum());
        a1.transpose();
        s.close();
    }
}