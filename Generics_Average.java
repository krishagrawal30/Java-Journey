import java.util.*;
class Average<T extends Number>
{
    public void findAverage(T[] num)
    {
        Integer sum = 0;
        for(T i:num)
        {
            sum += i.intValue();
        }
        System.out.println("Average is : "+sum/num.length);
    }
}
class Generics_Average 
{
    public static void main(String[] args)
    {
        Average<Integer> a1 = new Average<>();
        Integer[] arr = {10,20,30,40,50};
        a1.findAverage(arr);
    }
}