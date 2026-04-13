import java.util.*;
public class Traversal {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5)); // creating a list of integers
        for(int i: list){
            if(i==4)
                list.remove(4);
            System.out.println(i);
        Iterator<Integer> it = list.iterator(); // creating an iterator for the list
        while(it.hasNext()){
            int num = it.next(); // getting the next element in the list
            System.out.println(num); // printing the element

        }
    }
}
