import java.util.*;
class DivExc extends Exception
{
    public DivExc(String message)
    {
        super(message);
    }
}
class Calculator
{
    int num1,num2;
    public Calculator(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    void divide() throws DivExc
    {
        if(num2 == 0)
        {
            throw new DivExc("Cannot divide by zero....");
        }
        else{
            System.out.println("Division is : "+num1/num2);
        }
    }
}
public class practice
{
    public static void main(String[] args) {
        
        try {
            Calculator c = new Calculator(5,0);
            c.divide();
        } catch(DivExc e) {
            System.out.println(e.getMessage());
        }
    }
}