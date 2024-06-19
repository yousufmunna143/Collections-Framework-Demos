import java.util.*;

public class LearnStack 
{
    public static void main(String[] args)
    {
        Stack<String> animalStack = new Stack<>();

        animalStack.push("Dino");
        animalStack.push("Hippo");
        animalStack.push("Lion");
        animalStack.push("Panda");
        animalStack.push("Elephant");

        System.out.println(animalStack.peek());
        int len = animalStack.size();
        for(int cnt=0; cnt<len; cnt++)
        {
            System.out.println(animalStack.pop());
        }
    }
}

