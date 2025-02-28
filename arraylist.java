import java.util.*;
class arraylist
{
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();
        names.add("Krish");
        names.add("Vedant");
        names.add("Prateek");
        names.add("Prathmesh");
        System.out.println(names);
        LinkedList<Integer> roll = new LinkedList<Integer>();
        roll.add(1);
        roll.add(2);
        roll.add(3);
        roll.add(4);
        System.out.println(roll);
        names.remove(0);
        System.out.println(names);   
    }
}