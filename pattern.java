public class pattern {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int j=4-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++)
            {
                if((i==2 && k==2)||(i==3 && k>1 && k!=5))
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
    
}
