class datatype {
    int a;
    String name;
}

public class oops {
    public static void main(String[] args) {
        datatype d1 = new datatype();
        datatype d2 = new datatype();
        d1.a = 17;
        d1.name = "Krish";
        d2.a = 48;
        d2.name = "Prateek";
        System.out.println("Roll no = " + d1.a + "    Name = " + d1.name);
        System.out.println("Roll no = " + d2.a + "    Name = " + d2.name);
    }

}
