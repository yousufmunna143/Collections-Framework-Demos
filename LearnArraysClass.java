import java.util.*;

public class LearnArraysClass 
{
    public static void main(String[] args)    
    {
        int[] arr = {1,2,6,5,4,9,22};

        Arrays.sort(arr);

        for(int x:arr)
            System.out.println(x);

        int ind = Arrays.binarySearch(arr, 5);
        System.out.println(ind);

        Arrays.fill(arr, 33);

        for(int x:arr)
            System.out.println(x);
    }
}
