class Complex 
{
    int i,r;
    void set(int x, int y)
    {
        r = x;
        i = y;
    }
    void add(Complex ob2)
    {
        System.out.println("The sum is : "+(r + ob2.r)+"+"+(i+ob2.i)+"i");
    }
}
class SumOfComplex
{
    public static void main(String[] arg)
    {
        Complex ob1 = new Complex();
        Complex ob2 = new Complex();
        ob1.set(5,4);
        ob2.set(2,3);
        ob1.add(ob2);
    }
}