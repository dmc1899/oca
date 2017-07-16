package generics;

import java.util.List;

/**
 * Created by darragh on 09/07/2017.
 */
public class GenericMethods {

    public <T> void printMe(T[] arr){
        for (T item : arr)
            System.out.println(item.toString());

    }

    public void printList(List<?> list){
        for (Object item: list) System.out.println(item);
    }

    // Taken from literature, not used in my example.
    public <T> T ship(T t){
        System.out.println("working");
        return t;
    }
}
