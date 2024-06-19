import java.util.*;

public class LearnHashMap 
{
    public static void main(String[] args)   
    {
        // HashMap<String, Integer> nums = new HashMap<>();
        // TreeMap<String, Integer> nums = new TreeMap<>();
        TreeMap<Integer, Integer> nums = new TreeMap<>();

        // nums.put("one", 1);
        // nums.put("two", 2);
        // nums.put("three", 3);
        // nums.put("four", 4);
        // nums.put("five", 5);nums.put("one", 1);
        nums.put(7, 2);
        nums.put(3, 3);
        nums.put(5, 4);
        nums.put(4, 5);

        // if(!nums.containsKey("two"))
        // {
        //     nums.put("two",55);
        // }
        // nums.putIfAbsent("six", 6);

        // System.out.println(nums);
        // nums.remove("two");
        // System.out.println(nums.containsKey("oneee"));
        // System.out.println(nums.containsValue(3));
        // System.out.println(nums.isEmpty());
        // nums.put("five", nums.get("five") + 1);
        System.out.println(nums);

        // Iterating through Map

        // Method 1:
        for(Integer key:nums.keySet())
        {
            System.out.println(key + " " + nums.get(key));
        }        

        // Method 2:
        // for (Map.Entry<String,Integer> e:nums.entrySet())
        // {
        //     System.out.println(e);
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }

        // Method 3:
        // for(Integer value:nums.values())
        // {
        //     System.out.println(value);
        // }
    }
}
