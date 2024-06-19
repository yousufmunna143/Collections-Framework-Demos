import java.util.*;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        // List<Integer> al = new ArrayList<>();

        // al.add(5);
        // al.add(7);
        // al.add(4);
        // al.add(1);
        // al.add(9);
        // al.add(11);

        // List<Integer> al2 = new ArrayList<>();
        // al2.add(6);
        // al2.add(88);
        // al2.add(32);

        // appending all elements of list al2 to list al using addall method

        // al.addAll(al2);

        // for(int i=0; i<11; i++)
        //     al.add(i);
        // al.add(7);
         
        // al.remove(Integer.valueOf(7));
        // System.out.println(al);

        // contains() method
        // System.out.println(al.contains(11));
        // System.out.println(al.contains(15));

        // clear method -> used to remove all elements of list 
        // al.clear();
        // System.out.println(al);

        // // Traversing the ArrayList
        // // Method 1:
        // // Using regular for loop with get method
        // for(int i=0; i<al.size(); i++)
        //     System.out.print(al.get(i) + " ");
        // System.out.println();
        // // Method 2:
        // // using enhanced for loop
        // for(Integer element : al)
        //     System.out.print(element + " ");
        // // Method 3:
        // // using iterator class
        // // Iterator is an interface.Hence cannot create a object directly.Use .iterator() method
        // Iterator<Integer> iterator = al.iterator();
        // while(iterator.hasNext())
        //     System.out.print(iterator.next() + " ");
        List<List<Integer>> al = new ArrayList<>(100);
        List<Integer> al2 = new ArrayList<>();
        al2.add(6);
        al2.add(88);
        al2.add(32);
        List<Integer> al3 = new ArrayList<>();
        al3.add(6);
        al3.add(88);
        al3.add(32);
        Collections.sort(al3);
        Collections.fill(al, null);
        // al.set(0, al3);
        al.add(al2);
        System.out.println(al.get(0));
        // System.out.println(al3);

    }   
}