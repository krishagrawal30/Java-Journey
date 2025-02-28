import java.util.Scanner;
class Pizza
{
   private String s;
   private int ct;
   private int pt;
   private int ht;
   Pizza(String s, int ct, int pt, int ht)
   {
        this.s = s;
        this.ct = ct;
        this.pt = pt;
        this.ht = ht;
   }
   public void get()
   {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of Pizza : ");
        s = scan.next();
        System.out.println("Enter no of Cheese toppings : ");
        ct = scan.nextInt();  
        System.out.println("Enter no of Pepperoni toppings : ");
        pt = scan.nextInt();
        System.out.println("Enter no of Ham toppings : ");
        ht = scan.nextInt();
        scan.close();
   }
   public int calcCost()
   {
          if(s.equals("small"))
          {
               return(10+2*(ct+pt+ht));
          }  
          else if(s.equals("medium"))
          {
               return(12+2*(ct+pt+ht));
          }     
          else if(s.equals("large"))
          {
               return(14+2*(ct+pt+ht));
          }  
          else{
               return 0;
          }      
   }
   public void getDescription()
   {
          System.out.println("Pizza Size: "+s+"\tCheese toppings: "+ct+"\tPepperoni toppings: "+pt+"\tHam toppings: "+ht);
   }
}
public class PizzaCentre
{
    public static void main(String[] args)
    {
          Pizza p1 = new Pizza("small", 1, 2, 3);
          p1.get();
          System.out.println("Total cost of Pizza is : "+p1.calcCost());
          p1.getDescription();
    }
}