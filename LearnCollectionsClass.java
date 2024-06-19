import java.util.*;

public class LearnCollectionsClass 
{
    public static void main(String[] args)    
    {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(3);
        al.add(9);
        al.add(7);
        al.add(5);
        al.add(4);
        al.add(4);
        al.add(34);
        al.add(2);

        System.out.println("min element is " + Collections.min(al));
        System.out.println("max element is " + Collections.max(al));
        System.out.println("frequency of element 4 is " + Collections.frequency(al, 4));
    }
}
