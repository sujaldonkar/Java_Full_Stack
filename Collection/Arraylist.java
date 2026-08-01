import java.util.ArrayList;
import java.util.Collections;

public class Arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(101);
        list1.add(20);
        list1.add(15);
        list1.add(1,36);
        
        System.out.println(list1.contains(30));

        list1.set(1,555);

        list1.remove(1);

        Collections.sort(list1);

        for(int i:list1){
            System.out.println(i);
        }

    }
}